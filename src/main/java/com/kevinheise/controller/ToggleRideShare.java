package com.kevinheise.controller;

import com.kevinheise.entity.User;
import com.kevinheise.persistence.GenericDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 *  Servlet to toggle ride share on or off for user
 *
 *  @author kheise
 */
@WebServlet(name = "ToggleRideShare", urlPatterns = "/toggleRideShare")
public class ToggleRideShare extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        GenericDao dao = new GenericDao(User.class);
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        if (request.getParameter("action").equals("off")) {
            user.setRideShare("Y");
            dao.saveOrUpdate(user);
        } else {
            user.setRideShare("N");
            dao.saveOrUpdate(user);
        }

        response.sendRedirect("viewProfile");

    }
}
