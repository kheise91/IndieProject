package com.kevinheise.controller;

import com.kevinheise.entity.Role;
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
import java.io.IOException;

/**
 * Created by Kevin Heise
 */

@WebServlet(name = "SignUpUser", urlPatterns = { "/signUpUser" } )
public class SignUpUser extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        user.setUsername(req.getParameter("username"));
        user.setEmailAddress(req.getParameter("email"));
        user.setPassword(req.getParameter("password"));
        user.setZipCode(req.getParameter("zipCode"));
        user.setFavoriteGenre(req.getParameter("favoriteGenre"));

        logger.debug("Adding user: " + user);

        Role role = new Role();
        role.setName("user");
        role.setUsername(req.getParameter("username"));
        role.setUser(user);
        user.addRole(role);

        GenericDao dao = new GenericDao(User.class);
        dao.insert(user);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/signUpConfirmation.jsp");
        dispatcher.forward(req, resp);
    }

}
