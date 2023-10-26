package com.location.tables;

import com.location.config.DatabaseConfiguration;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgresTableCreator {

    public static void createTables() {
        Connection connection = DatabaseConfiguration.getConnection();
        Statement statement = null;

        try {
            statement = connection.createStatement();

            // SQL statements to create tables
            String createTableSQL = "CREATE TABLE IF NOT EXISTS pondicherry ("
                    + "id serial PRIMARY KEY, "
                    + "State VARCHAR(255), "
                    + "Area VARCHAR(255), "
                    + "Pincode VARCHAR(255)"
                    + ")";

            statement.execute(createTableSQL);
            System.out.println("Table created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        createTables();
    }

}
