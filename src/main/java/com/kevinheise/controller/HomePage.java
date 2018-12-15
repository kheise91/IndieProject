package com.kevinheise.controller;

import com.kevinheise.entity.User;
import com.kevinheise.persistence.GenericDao;

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

@WebServlet(name = "HomePage", urlPatterns = { "/home" } )
public class HomePage extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        GenericDao dao = new GenericDao(User.class);

        Principal userPrincipal = request.getUserPrincipal();
        String username = userPrincipal.getName();
        List<User> foundUser = dao.getByPropertyEqual("username", username);
        User user = (User) foundUser.get(0);

        HttpSession session = request.getSession();

        session.setAttribute("user", user);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
        dispatcher.forward(request, response);
    }
}
