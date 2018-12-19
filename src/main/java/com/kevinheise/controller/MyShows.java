package com.kevinheise.controller;

import com.kevinheise.entity.Show;
import com.kevinheise.entity.User;
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
import java.util.Collections;
import java.util.List;
import java.util.Set;

@WebServlet(name = "MyShows", urlPatterns = "/myShows")
public class MyShows extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        String successfulUpdateMessage = "";
        if (request.getParameter("update") != null && !request.getParameter("update").isEmpty()) {
            successfulUpdateMessage = "Event Added Successfully";
        }

        Set<Show> shows = Collections.emptySet();
        List<EventItem> events = Collections.emptyList();
        String url = "http://api.eventful.com/rest/events/get?id=";
        String errorMessage = "";

        try {
            shows = user.getShows();
        } catch (NullPointerException exception) {
            logger.error(exception);
        }

        if (shows != null && !shows.isEmpty()) {
            for (Show show : shows) {
                events.add(new ServiceConsumer().getEvents(url + show.getShowId() + "&app_key=").get(0));
            }
        } else {
            errorMessage = "You have not added any events yet.";
        }


        session.setAttribute("updateMessage", successfulUpdateMessage);
        session.setAttribute("errorMessage", errorMessage);
        session.setAttribute("events", events);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/myShows.jsp");
        dispatcher.forward(request, response);
    }

}
