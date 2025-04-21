package com.library.servlet;

import com.library.bean.IssuedBook;
import com.library.dao.BookDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/IssueBookServlet")
public class IssueBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userEmail = request.getParameter("userEmail");
        int bookId = Integer.parseInt(request.getParameter("bookId"));
        String issueDate = request.getParameter("issueDate");
        String dueDate = request.getParameter("dueDate");

        IssuedBook issuedBook = new IssuedBook();
        issuedBook.setUserEmail(userEmail);
        issuedBook.setBookId(bookId);
        issuedBook.setIssueDate(java.sql.Date.valueOf(issueDate));
        issuedBook.setDueDate(java.sql.Date.valueOf(dueDate));

        BookDAO dao = new BookDAO();

        try {
            boolean success = dao.issueBook(issuedBook);
            if (success) {
                response.sendRedirect("admin_dashboard.jsp?message=Book issued successfully");
            } else {
                response.sendRedirect("admin_dashboard.jsp?error=Book could not be issued");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }
}
