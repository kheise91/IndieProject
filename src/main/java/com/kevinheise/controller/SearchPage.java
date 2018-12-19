package com.kevinheise.controller;

import com.kevinheise.eventful.EventItem;
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
import java.util.Collections;
import java.util.List;

@WebServlet(name = "SearchPage", urlPatterns = { "/search" })
public class SearchPage extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String url = "";
        String errorMessage = "";
        List<EventItem> events = null;
        HttpSession session = request.getSession();

        if (request.getParameter("submit") != null && !request.getParameter("submit").isEmpty()) {
            // Event form parameters
            String genre = request.getParameter("genre");
            String distance = request.getParameter("distance");
            String zipCode = request.getParameter("zipCode");

            // Validate form
            if (genre == null || genre.isEmpty()) {
                errorMessage = "*Please select a genre";
            } else if (distance == null || distance.isEmpty()) {
                errorMessage = "*Please select a distance";
            } else if (zipCode == null || zipCode.isEmpty()) {
                errorMessage = "*Please enter a zip code";
            } else {
                url = "http://api.eventful.com/json/events/search?location=" + zipCode + "&within=" + distance + "&category=music_"
                        + genre + "&sort_order=date&app_key=";
                logger.info("Search url: " + url);

                // Event event list, set session attributes and forward to search.jsp
                events = new ServiceConsumer().getEvents(url);
                logger.info(events);

                if (events == null || events.isEmpty()) {
                    errorMessage = "No events found, please try again later";
                } else {
                    DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("MMM");
                    DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("dd");
                    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
                    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a");

                    session.setAttribute("monthFormatter", monthFormatter);
                    session.setAttribute("dayFormatter", dayFormatter);
                    session.setAttribute("dateFormatter", dateFormatter);
                    session.setAttribute("timeFormatter", timeFormatter);
                }
            }
        }
        session.setAttribute("events", events);
        session.setAttribute("errorMessage", errorMessage);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/search.jsp");
        dispatcher.forward(request, response);
    }

}
