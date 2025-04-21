package com.library.servlet;

import com.library.bean.Book;
import com.library.dao.AdminDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String category = request.getParameter("category");
        int totalCopies = Integer.parseInt(request.getParameter("totalCopies"));

        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setTotalCopies(totalCopies);
        book.setAvailableCopies(totalCopies);

        try {
            new AdminDAO().addBook(book);
            response.sendRedirect("admin_dashboard.jsp?message=Book added successfully");
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }
}

