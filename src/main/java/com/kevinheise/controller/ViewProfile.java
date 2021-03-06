package com.kevinheise.controller;

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

/**
 *  Servlet to control the view profile page. Default profile is the user logged in, but other profiles can be viewed
 *  with the use of a url parameter.
 *
 *  @author kheise
 */
@WebServlet(name = "ViewProfile", urlPatterns = { "/viewProfile" })
public class ViewProfile extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");

        User profile;
        String profileName = req.getParameter("username");
        GenericDao userDao = new GenericDao(User.class);
        if (profileName != null && !profileName.isEmpty()) {
            profile = (User)userDao.getByPropertyEqual("username", req.getParameter("username")).get(0);
        } else {
            profile = user;
        }

        logger.info(profile);

        session.setAttribute("profile", profile);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/viewProfile.jsp");
        dispatcher.forward(req, resp);
    }

}
