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
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Date;
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

        // Set session attributes and forward to home.jsp
        List<EventItem> events = getEventList(user.getZipCode(), user.getFavoriteGenre());
        DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("MMM");
        DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("dd");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a");

        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        session.setAttribute("events", events);
        session.setAttribute("monthFormatter", monthFormatter);
        session.setAttribute("dayFormatter", dayFormatter);
        session.setAttribute("dateFormatter", dateFormatter);
        session.setAttribute("timeFormatter", timeFormatter);



        RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
        dispatcher.forward(request, response);
    }

    public List<EventItem> getEventList(String location, String favoriteGenre) {
        Properties properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream("/project.properties"));
        } catch(IOException e) {
            logger.error(e);
        }

        String appKey = properties.getProperty("app_key");
        String url = "http://api.eventful.com/json/events/search?location=" + location + "&within=50&category=music_"
                + favoriteGenre + "&sort_order=date&app_key=";

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(url + appKey);
        String eventfulResponse = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

        try {
            Search results = mapper.readValue(eventfulResponse, Search.class);
            Events events = results.getEvents();
            if (events != null) {
                return events.getEvent();
            } else {
                return Collections.emptyList();
            }
        } catch (IOException ioe) {
            logger.error(ioe);
            return Collections.emptyList();
        }
    }
}
