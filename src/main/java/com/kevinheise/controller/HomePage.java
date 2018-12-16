package com.kevinheise.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kevinheise.entity.User;
import com.kevinheise.eventful.*;
import com.kevinheise.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.security.Principal;
import java.util.List;
import java.util.Properties;

@WebServlet(name = "HomePage", urlPatterns = { "/home" } )
public class HomePage extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Get user information
        GenericDao dao = new GenericDao(User.class);
        Principal userPrincipal = request.getUserPrincipal();
        String username = userPrincipal.getName();
        List<User> foundUser = dao.getByPropertyEqual("username", username);
        User user = (User) foundUser.get(0);
        logger.info(user.getUsername());

        // Get concert information based on user's favorite genre
        Properties properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream("/project.properties"));
        } catch(IOException e) {
            logger.debug(e);
        }
        String location = user.getZipCode();
        String favoriteGenre = user.getFavoriteGenre();
        String appKey = properties.getProperty("app_key");
        String url = "http://api.eventful.com/json/events/search?location=" + location + "&within=50&category=music_" + favoriteGenre
                + "&sort_order=date&app_key=";
        logger.info(url);

        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target(url + appKey);
        String eventfulResponse = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        Search results = mapper.readValue(eventfulResponse, Search.class);
        Events events = results.getEvents();
        List<EventItem> eventList = events.getEvent();

        // Set session attributes and foward to home.jsp
        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        session.setAttribute("events", eventList);


        RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
        dispatcher.forward(request, response);
    }
}
