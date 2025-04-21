package com.library.dao;

import com.library.bean.Book;
import com.library.bean.IssuedBook;
import com.library.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminDAO {

    public void addBook(Book book) throws SQLException {
        String query = "INSERT INTO books (title, author, total_copies, available_copies) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, book.getTitle());
            stmt.setString(2, book.getAuthor());
            stmt.setInt(3, book.getTotalCopies());
            stmt.setInt(4, book.getAvailableCopies());
            stmt.executeUpdate();
        }
    }

    public List<IssuedBook> getAllReissueRequests() throws SQLException {
        List<IssuedBook> requests = new ArrayList<>();
        String query = "SELECT * FROM issued_books WHERE reissue_requested = true";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                IssuedBook book = new IssuedBook();
                book.setIssueId(rs.getInt("issue_id"));
                book.setBookId(rs.getInt("book_id"));
                book.setUserEmail(rs.getString("user_email"));
                book.setIssueDate(rs.getDate("issue_date"));
                book.setDueDate(rs.getDate("due_date"));
                book.setReturnDate(rs.getDate("return_date"));
                book.setFine(rs.getDouble("fine"));
                book.setReissueRequested(rs.getBoolean("reissue_requested"));
                requests.add(book);
            }
        }

        return requests;
    }

    public void approveReissue(int issueId, Date newDueDate) throws SQLException {
        String query = "UPDATE issued_books SET due_date = ?, reissue_requested = false WHERE issue_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setDate(1, new java.sql.Date(newDueDate.getTime()));
            stmt.setInt(2, issueId);
            stmt.executeUpdate();
        }
    }

    public void rejectReissue(int issueId) throws SQLException {
        String query = "UPDATE issued_books SET reissue_requested = false WHERE issue_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, issueId);
            stmt.executeUpdate();
        }
    }

    public void applyFine(int issueId, double fine) throws SQLException {
        String query = "UPDATE issued_books SET fine = ? WHERE issue_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setDouble(1, fine);
            stmt.setInt(2, issueId);
            stmt.executeUpdate();
        }
    }

    public void removeFine(int issueId) throws SQLException {
        String query = "UPDATE issued_books SET fine = 0 WHERE issue_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, issueId);
            stmt.executeUpdate();
        }
    }

    public List<IssuedBook> getOverdueBooksWithUsers() throws SQLException {
        List<IssuedBook> overdueBooks = new ArrayList<>();
        String query = "SELECT * FROM issued_books WHERE due_date < CURDATE() AND return_date IS NULL";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                IssuedBook book = new IssuedBook();
                book.setIssueId(rs.getInt("issue_id"));
                book.setBookId(rs.getInt("book_id"));
                book.setUserEmail(rs.getString("user_email"));
                book.setIssueDate(rs.getDate("issue_date"));
                book.setDueDate(rs.getDate("due_date"));
                book.setReturnDate(rs.getDate("return_date"));
                book.setFine(rs.getDouble("fine"));
                book.setReissueRequested(rs.getBoolean("reissue_requested"));
                overdueBooks.add(book);
            }
        }

        return overdueBooks;
    }
}
