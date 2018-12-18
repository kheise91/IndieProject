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
import java.security.Principal;
import java.util.List;

@WebServlet(name = "ViewProfile", urlPatterns = { "/viewProfile" })
public class ViewProfile extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        GenericDao userDao = new GenericDao(User.class);
        User user = (User) userDao.getByPropertyEqual("username", req.getUserPrincipal().getName()).get(0);

        User profile;
        String profileName = req.getParameter("username");
        if (profileName != null && !profileName.isEmpty()) {
            profile = (User)userDao.getByPropertyEqual("username", req.getParameter("username")).get(0);
        } else {
            profile = user;
        }

        logger.info(profile);

        session.setAttribute("user", user);
        session.setAttribute("profile", profile);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/viewProfile.jsp");
        dispatcher.forward(req, resp);
    }

}