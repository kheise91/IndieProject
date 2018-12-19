package com.kevinheise.controller;

import com.kevinheise.entity.Shows;
import com.kevinheise.entity.User;
import com.kevinheise.eventful.Event;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 *  Servlet for MyShows page, loads any shows that user has added to their list
 *
 *  @author kheise
 */
@WebServlet(name = "MyShows", urlPatterns = "/myShows")
public class MyShows extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        // Get user's shows
        Set<Shows> shows = user.getShows();
        List<Event> events = new ArrayList<>();
        String url = "http://api.eventful.com/json/events/get?id=";

        String errorMessage = "";
        if (shows != null && !shows.isEmpty()) {
            List<String> userShows = new ArrayList<>();
            for (Shows show : shows) {
                userShows.add(show.getShowId());
                Event event = new ServiceConsumer().getEvent(url + show.getShowId() + "&app_key=");
                events.add(event);
            }
            session.setAttribute("userShows", userShows);
        } else {
            errorMessage = "You have not added any events yet.";
        }

        session.setAttribute("errorMessage", errorMessage);
        session.setAttribute("events", events);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/myShows.jsp");
        dispatcher.forward(request, response);
    }

}
