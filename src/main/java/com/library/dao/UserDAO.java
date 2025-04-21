package com.library.dao;

import com.library.bean.User;
import com.library.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    // Register a new user
    public void registerUser(User user) throws SQLException {
        String query = "INSERT INTO users (name, email, contact, password,user_type) VALUES (?, ?, ?, ?,'student')";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getContact());
            stmt.setString(4, user.getPassword());
            stmt.executeUpdate();
        }
    }


    public String getUserRole(String email, String password) {
        String role = null;
        String query = "SELECT user_type FROM users WHERE email = ? AND password = ?";
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, email);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                role = resultSet.getString("user_type");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return role;
    }


    // Check login credentials
    public boolean checkUserCredentials(String email, String password) {
        boolean isValid = false;

        // DB connection
        try (Connection connection = DBConnection.getConnection()) {
            String query = "SELECT * FROM users WHERE email = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, email);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                isValid = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isValid;
    }
}
