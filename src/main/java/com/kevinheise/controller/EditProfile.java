package com.kevinheise.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 *  Servlet that redirects to the edit profile page, and clears and error messages previously set
 *
 *  @author kheise
 */
@WebServlet(name = "EditProfile", urlPatterns = "/editProfile")
public class EditProfile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String errorMessage = "";
        session.setAttribute("errorMessage", errorMessage);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/editProfile.jsp");
        dispatcher.forward(request, response);
    }
}
