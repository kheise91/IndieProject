package com.kevinheise.controller;

import com.kevinheise.entity.Role;
import com.kevinheise.entity.User;
import com.kevinheise.persistence.GenericDao;
import org.apache.catalina.realm.MessageDigestCredentialHandler;
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
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Created by Kevin Heise
 */

@WebServlet(name = "SignUpUser", urlPatterns = { "/signUp" } )
public class SignUpUser extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao dao = new GenericDao(User.class);

        // Get form data
        String firstName = req.getParameter("firstName");
        String lastName  = req.getParameter("lastName");
        String username  = req.getParameter("username");
        String email     = req.getParameter("email");
        String number    = req.getParameter("phoneNumber");
        String birthdate = req.getParameter("birthdate");
        String password  = req.getParameter("password");
        String confirm   = req.getParameter("passwordConfirm");
        String city      = req.getParameter("city");
        String state     = req.getParameter("state");
        String zipCode   = req.getParameter("zipCode");
        String genre     = req.getParameter("favoriteGenre");

        // Validate Form
        String errorMessage = "";
        List<User> usernameCheck = dao.getByPropertyLike("username", username);
        if (usernameCheck.size() != 0) {
            // Check for unique username
            errorMessage = "*The username you have selected is already in use.";
            HttpSession session = req.getSession();
            session.setAttribute("errorMessage", errorMessage);
            resp.sendRedirect("signUp.jsp#signUp");
        } else if (username.length() < 5) {
            // Check that username is at least 5 characters
            errorMessage = "*Username must be at least 5 characters.";
            HttpSession session = req.getSession();
            session.setAttribute("errorMessage", errorMessage);
            resp.sendRedirect("signUp.jsp#signUp");
        } else if (password.length() < 6) {
            // Check that password is at least 6 characters
            errorMessage = "*Password must be at least six characters.";
            HttpSession session = req.getSession();
            session.setAttribute("errorMessage", errorMessage);
            resp.sendRedirect("signUp.jsp#signUp");
        } else if (!password.equals(confirm)) {
            // Check that passwords match
            errorMessage = "*The passwords you have entered do not match.";
            HttpSession session = req.getSession();
            session.setAttribute("errorMessage", errorMessage);
            resp.sendRedirect("signUp.jsp#signUp");
        } else if (zipCode.length() != 5) {
            // Check that zip code is 5 characters long
            errorMessage = "*Zip code must be exactly five digits.";
            HttpSession session = req.getSession();
            session.setAttribute("errorMessage", errorMessage);
            resp.sendRedirect("signUp.jsp#signUp");
        } else if (genre.equals("none")) {
            // Check that a favorite genre is selected
            errorMessage = "*Please select your favorite genre.";
            HttpSession session = req.getSession();
            session.setAttribute("errorMessage", errorMessage);
            resp.sendRedirect("signUp.jsp#signUp");
        } else {
            // Validation complete, add user
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate formattedBirthdate = LocalDate.parse(birthdate, formatter);
            User user = new User(username, hashPassword(password), firstName, lastName, email, number,city, state,
                    formattedBirthdate, zipCode, genre);
            Role role = new Role("user", username, user);
            logger.info("Adding user: " + user);
            user.addRole(role);

            dao.insert(user);

            RequestDispatcher dispatcher = req.getRequestDispatcher("/signUpConfirmation.jsp");
            dispatcher.forward(req, resp);
        }
    }

    public String hashPassword(String passwordToHash) {

        MessageDigestCredentialHandler credentialHandler = new MessageDigestCredentialHandler();
        try {
            credentialHandler.setAlgorithm("sha-512");
        } catch (NoSuchAlgorithmException e) {
            logger.error("Exception:", e);
        }

        credentialHandler.setEncoding("UTF-8");
        String hashedPassword = credentialHandler.mutate(passwordToHash);

        return hashedPassword;
    }

}
