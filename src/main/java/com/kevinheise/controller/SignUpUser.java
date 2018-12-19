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
        HttpSession session = req.getSession();

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
            errorMessage = "*The username you have selected is already in use.";
        } else if (username.length() < 5) {
            errorMessage = "*Username must be at least 5 characters.";
        } else if (password.length() < 6) {
            errorMessage = "*Password must be at least six characters.";
        } else if (!password.equals(confirm)) {
            errorMessage = "*The passwords you have entered do not match.";
        } else if (zipCode.length() != 5) {
            errorMessage = "*Zip code must be exactly five digits.";
        } else if (genre == null || genre.isEmpty()) {
            errorMessage = "*Please select your favorite genre.";
        } else if (state == null || state.isEmpty()) {
            errorMessage = "*Please select your state.";
        } else {
            // Validation complete, add user
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate formattedBirthdate = LocalDate.parse(birthdate, formatter);
            String formattedNumber = "+1" + number.replaceAll("[\\s\\-()]", "");
            logger.info(formattedNumber);

            User user = new User(username, hashPassword(password), firstName, lastName, email, formattedNumber, city, state,
                    formattedBirthdate, zipCode, genre, "N");
            Role role = new Role("user", username, user);

            logger.info("Adding user: " + user);
            user.addRole(role);
            dao.insert(user);

            RequestDispatcher dispatcher = req.getRequestDispatcher("/signUpConfirmation.jsp");
            dispatcher.forward(req, resp);
            return;
        }

        session.setAttribute("errorMessage", errorMessage);
        resp.sendRedirect("signUp.jsp#signUp");
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
