package com.kevinheise.controller;

import com.kevinheise.entity.Shows;
import com.kevinheise.entity.User;
import com.kevinheise.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "AddRemoveShow", urlPatterns = "/addRemoveShow")
public class AddRemoveShow extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        GenericDao userDao = new GenericDao(User.class);
        GenericDao showsDao = new GenericDao(Shows.class);
        User user = (User) session.getAttribute("user");
        String showId = request.getParameter("showId");

        if (request.getParameter("action").equals("add")) {
            SMSMessenger messenger = new SMSMessenger();

            //messenger.sendMessageToUser(user);

            Shows show = new Shows(user, showId);
            logger.info("adding show: " + show);
            user.addShow(show);
            userDao.saveOrUpdate(user);
        } else if (request.getParameter("action").equals("remove")) {
            Shows show = (Shows) showsDao.getByPropertyEqual("showId", showId).get(0);
            logger.info("removing show: " + show);
            user.removeShow(show);
            userDao.saveOrUpdate(user);
        }

        response.sendRedirect("myShows?update=success");
    }

}
