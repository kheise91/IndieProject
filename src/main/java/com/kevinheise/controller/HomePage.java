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

        GenericDao dao = new GenericDao(User.class);
        User user = (User) dao.getByPropertyEqual("username", request.getUserPrincipal().getName()).get(0);
        String url = "";
        String errorMessage = "";
        List<EventItem> events = null;
        HttpSession session = request.getSession();

        // Build url to retrieve upcoming shows based on user's favorite genre
        url = "http://api.eventful.com/json/events/search?location=" + user.getZipCode() + "&within=50&category=music_"
                + user.getFavoriteGenre() + "&sort_order=date&app_key=";
        events = new ServiceConsumer().getEvents(url);
        if (events == null || events.isEmpty()) {
            errorMessage = "No events found, try again later";
        }

        // Set session attributes and forward to home.jsp
        DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("MMM");
        DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("dd");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a");

        session.setAttribute("user", user);
        session.setAttribute("events", events);
        session.setAttribute("errorMessage", errorMessage);
        session.setAttribute("monthFormatter", monthFormatter);
        session.setAttribute("dayFormatter", dayFormatter);
        session.setAttribute("dateFormatter", dateFormatter);
        session.setAttribute("timeFormatter", timeFormatter);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
        dispatcher.forward(request, response);
    }

}
