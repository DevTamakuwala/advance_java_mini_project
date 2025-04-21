package com.library.servlet;

import com.library.bean.IssuedBook;
import com.library.dao.BookDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/StudentIssuedBooksServlet")
public class StudentIssuedBooksServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, RuntimeException {

        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("userEmail") == null || !"student".equals(session.getAttribute("userType"))) {
            response.sendRedirect("Login.jsp");
            return;
        }

        String email = (String) session.getAttribute("userEmail");

        BookDAO bookDAO = new BookDAO();
        List<IssuedBook> issuedBooks = null;
        try {
            issuedBooks = bookDAO.getIssuedBooksForStudent(email);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        request.setAttribute("issuedBooks", issuedBooks);
        request.getRequestDispatcher("WEB-INF/student_dashboard.jsp").forward(request, response);
    }
}
