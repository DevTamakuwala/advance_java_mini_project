package com.library.servlet;

import com.library.bean.IssuedBook;
import com.library.dao.BookDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/studentIssuedBooks")
public class StudentIssuedBooksServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userEmail = (String) request.getSession().getAttribute("userEmail");
        BookDAO dao = new BookDAO();
        try {
            List<IssuedBook> list = dao.getIssuedBooksForStudent(userEmail);
            request.setAttribute("issuedBooks", list);
            request.getRequestDispatcher("student_issued_books.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

