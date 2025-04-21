package com.library.servlet;

import com.library.bean.User;
import com.library.dao.UserDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String contact = request.getParameter("cono");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("cpassword");

        if (!password.equals(confirmPassword)) {
            response.sendRedirect("register.jsp?message=Passwords do not match");
            return;
        }

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setContact(contact);
        user.setPassword(password);

        UserDAO userDAO = new UserDAO();  // ✅ Declare it here

        try {
            userDAO.registerUser(user);   // ✅ Call the method
            response.sendRedirect("index.jsp?message=Registration successful");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("register.jsp?message=Registration failed");
        }
    }
}
