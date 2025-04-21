package com.library.servlet;

import com.library.dao.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        UserDAO userDAO = new UserDAO();
        if (userDAO.checkUserCredentials(email, password)) {
            HttpSession session = request.getSession();
            session.setAttribute("userEmail", email);

            String userType = userDAO.getUserRole(email, password);
            session.setAttribute("user_type", userType);

            if (userType.equalsIgnoreCase("admin")) {
                response.sendRedirect("admin_dashboard.jsp");
            } else {
                response.sendRedirect("student_dashboard.jsp");
            }
        } else {
            response.sendRedirect("Login.jsp");
        }
    }
}
