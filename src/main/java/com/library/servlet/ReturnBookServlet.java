package com.library.servlet;

import com.library.dao.BookDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

@WebServlet("/returnBook")
public class ReturnBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int issueId = Integer.parseInt(request.getParameter("issueId"));
        Date returnDate = Date.valueOf(request.getParameter("returnDate")); // yyyy-MM-dd
        double fine = Double.parseDouble(request.getParameter("fine"));

        try {
            new BookDAO().returnBook(issueId, returnDate, fine);
            response.sendRedirect("adminIssuedBooks");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

