/*

    For picking the configuration from the application.properties file.

package com.location.config;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConfiguration {
    private String jdbcURL;
    private String username;
    private String password;

    public DatabaseConfiguration() {
        try {
            Properties properties = new Properties();

            // Load the properties from the classpath (src/main/resources)
            InputStream input = getClass().getResourceAsStream("/application.properties");
            properties.load(input);
            input.close();

            jdbcURL = properties.getProperty("custom.jdbcUrl");
            username = properties.getProperty("custom.dbUsername");
            password = properties.getProperty("custom.dbPassword");

            // Now you have loaded the properties
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load database properties.");
        }
    }

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(jdbcURL, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            throw  new RuntimeException("Failed to connect to the database.");
        }
    }
}


 */
