package com.library.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/miniproject"; // change this
    private static final String USER = "root"; // your MySQL username
    private static final String PASSWORD = "root"; // set your actual password

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // make sure mysql-connector-java jar is in WEB-INF/lib
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("MySQL Driver not found.");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Database connection error: " + e.getMessage());
        }
    }
}
