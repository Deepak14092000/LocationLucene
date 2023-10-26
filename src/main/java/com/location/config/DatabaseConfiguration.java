package com.location.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfiguration {

    private static final String jdbcURL = "jdbc:postgresql://localhost:5432/pondicherry_locations";
    private static final String username = "postgres";
    private static final String password = "pgadmin";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(jdbcURL, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to connect to the database.");
        }
    }
}
