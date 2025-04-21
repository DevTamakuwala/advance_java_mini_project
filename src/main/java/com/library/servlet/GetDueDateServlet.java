package com.library.servlet;

import com.library.util.DBConnection;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/GetDueDateServlet")
public class GetDueDateServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int issueId = Integer.parseInt(request.getParameter("issueId"));
        String query = "SELECT due_date FROM issued_books WHERE issue_id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, issueId);
            ResultSet rs = stmt.executeQuery();

            response.setContentType("text/plain");
            PrintWriter out = response.getWriter();
            if (rs.next()) {
                Date dueDate = rs.getDate("due_date");
                out.print(dueDate);
            } else {
                out.print("notfound");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
