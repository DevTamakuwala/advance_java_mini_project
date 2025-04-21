package com.library.dao;

import com.library.bean.IssuedBook;
import com.library.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookDAO {

    public List<IssuedBook> getIssuedBooksForStudent(String email) throws SQLException {
        List<IssuedBook> issuedBooks = new ArrayList<>();
        String query = "SELECT * FROM issued_books WHERE user_email = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, email);
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
                issuedBooks.add(book);
            }
        }
        return issuedBooks;
    }

    public List<IssuedBook> getAllIssuedBooks() throws SQLException {
        List<IssuedBook> issuedBooks = new ArrayList<>();
        String query = "SELECT * FROM issued_books";
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
                issuedBooks.add(book);
            }
        }
        return issuedBooks;
    }

    public void requestReissue(int issueId) throws SQLException {
        String query = "UPDATE issued_books SET reissue_requested = true WHERE issue_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, issueId);
            stmt.executeUpdate();
        }
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

    public void returnBook(int issueId, Date returnDate, double fine) throws SQLException {
        String query = "UPDATE issued_books SET return_date = ?, fine = ? WHERE issue_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setDate(1, new java.sql.Date(returnDate.getTime()));
            stmt.setDouble(2, fine);
            stmt.setInt(3, issueId);
            stmt.executeUpdate();
        }

        // Increase available copies in books
        String updateBooks = "UPDATE books SET available_copies = available_copies + 1 WHERE book_id = (SELECT book_id FROM issued_books WHERE issue_id = ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(updateBooks)) {
            stmt.setInt(1, issueId);
            stmt.executeUpdate();
        }
    }
}

