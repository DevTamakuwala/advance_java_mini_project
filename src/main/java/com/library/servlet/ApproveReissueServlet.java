package com.library.servlet;

import com.library.dao.BookDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Date;

@WebServlet("/approveReissue")
public class ApproveReissueServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int issueId = Integer.parseInt(request.getParameter("issueId"));
        Date newDueDate = Date.valueOf(request.getParameter("newDueDate")); // in format yyyy-MM-dd
        try {
            new BookDAO().approveReissue(issueId, newDueDate);
            response.sendRedirect("adminIssuedBooks");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

