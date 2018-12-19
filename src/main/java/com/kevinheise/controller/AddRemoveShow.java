package com.kevinheise.controller;

import com.kevinheise.entity.Shows;
import com.kevinheise.entity.User;
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
import java.util.List;
import java.util.Set;

@WebServlet(name = "AddRemoveShow", urlPatterns = "/addRemoveShow")
public class AddRemoveShow extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        GenericDao userDao = new GenericDao(User.class);
        GenericDao showsDao = new GenericDao(Shows.class);
        User user = (User) session.getAttribute("user");
        List<String> userShows = (List<String>) session.getAttribute("userShows");
        String action = request.getParameter("action");
        String showId = request.getParameter("showId");
        String showTitle = request.getParameter("showTitle");
        String url = "http://18.218.13.172:8080/ShowMe/viewProfile?username=";

        if (action.equals("add")) {

            if (user.getRideShare().equals("Y")) {
                List<User> users = userDao.getByPropertyEqual("rideShare", "Y");
                logger.info("Users with rideshare: " + users);

                for (User foundUser : users) {
                    Set<Shows> shows = foundUser.getShows();

                    for (Shows show: shows) {

                        if (show.getShowId().equals(showId)) {
                            SMSMessenger messenger = new SMSMessenger();
                            messenger.sendMessageToUser(foundUser, foundUser.getFirstName() + " wants to go to " + showTitle
                                    + ". View their profile here: " + url + foundUser.getUsername());
                        }
                    }
                }
            }

            userShows.add(showId);
            Shows show = new Shows(user, showId);
            logger.info("adding show: " + show);
            user.addShow(show);
            userDao.saveOrUpdate(user);

        } else if (action.equals("remove")) {

            List<Shows> shows = showsDao.getByPropertyEqual("showId", showId);
            for (Shows show: shows) {
                if (show.getUser().equals(user)) {
                    userShows.remove(showId);
                    logger.info("removing show: " + show);
                    user.removeShow(show);
                    userDao.saveOrUpdate(user);
                }
            }
        }
        session.setAttribute("userShows", userShows);
        response.sendRedirect("myShows");

    }

}
