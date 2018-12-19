package com.kevinheise.controller;

import com.kevinheise.entity.Shows;
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
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.*;

@WebServlet(name = "HomePage", urlPatterns = { "/home" } )
public class HomePage extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Get user and user's list of shows
        HttpSession session = request.getSession();
        String errorMessage = "";

        GenericDao dao = new GenericDao(User.class);
        User user = (User) dao.getByPropertyEqual("username", request.getUserPrincipal().getName()).get(0);
        Set<Shows> shows = user.getShows();
        logger.info(shows);
        List<String> userShows = new ArrayList<>();
        for (Shows show : shows) {
            userShows.add(show.getShowId());
        }
        logger.info(userShows);

        // Build url to retrieve upcoming shows based on user's favorite genre
        String url = "http://api.eventful.com/json/events/search?location=" + user.getZipCode() + "&within=50&category=music_"
                + user.getFavoriteGenre() + "&sort_order=date&app_key=";
        List<EventItem> events = new ServiceConsumer().getEvents(url);
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
        session.setAttribute("userShows", userShows);
        session.setAttribute("errorMessage", errorMessage);
        session.setAttribute("monthFormatter", monthFormatter);
        session.setAttribute("dayFormatter", dayFormatter);
        session.setAttribute("dateFormatter", dateFormatter);
        session.setAttribute("timeFormatter", timeFormatter);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
        dispatcher.forward(request, response);
    }

}
