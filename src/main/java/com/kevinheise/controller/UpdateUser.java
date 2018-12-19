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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *  Servlet to update a user after filling out the edit profile form.
 *
 *  @author kheise
 */
@WebServlet(name = "UpdateUser", urlPatterns = "/updateUser")
public class UpdateUser extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        GenericDao dao = new GenericDao(User.class);
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        String errorMessage = "";

        // Event form data
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String number = request.getParameter("phoneNumber");
        String birthdate = request.getParameter("birthdate");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zipCode = request.getParameter("zipCode");
        String genre = request.getParameter("favoriteGenre");

        // Validate Form
        if (zipCode.length() != 5) {
            errorMessage = "*Zip code must be exactly five digits.";
        } else if (genre == null || genre.isEmpty()) {
            errorMessage = "*Please select your favorite genre.";
        } else if (state == null || state.isEmpty()) {
            errorMessage = "*Please select your state.";
        } else {
            // Validation complete, update user's information
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate formattedBirthdate = LocalDate.parse(birthdate, formatter);
            String formattedNumber = "+1" + number.replaceAll("[\\s\\-()]", "");

            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setEmailAddress(email);
            user.setPhoneNumber(formattedNumber);
            user.setBirthdate(formattedBirthdate);
            user.setCity(city);
            user.setState(state);
            user.setZipCode(zipCode);
            user.setFavoriteGenre(genre);

            logger.info("Updating user: " + user);
            dao.saveOrUpdate(user);

            response.sendRedirect("viewProfile");
            return;
        }

        session.setAttribute("errorMessage", errorMessage);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/editProfile.jsp");
        dispatcher.forward(request, response);
    }


}
