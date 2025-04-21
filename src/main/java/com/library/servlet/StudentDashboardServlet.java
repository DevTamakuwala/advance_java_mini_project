package com.library.servlet;

import com.library.bean.IssuedBook;
import com.library.dao.BookDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/StudentDashboardServlet")
public class StudentDashboardServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        if (session == null || !"student".equals(session.getAttribute("userType"))) {
            response.sendRedirect("Login.jsp");
            return;
        }

        String email = (String) session.getAttribute("userEmail");
        BookDAO bookDAO = new BookDAO();

        try {
            List<IssuedBook> issuedBooks = bookDAO.getIssuedBooksForStudent(email);
            request.setAttribute("issuedBooks", issuedBooks);
            RequestDispatcher dispatcher = request.getRequestDispatcher("student_dashboard.jsp");
            dispatcher.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }
}

