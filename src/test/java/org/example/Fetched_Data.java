package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class Fetched_Data {
    public static void main(String[] args) {
        // Insert data into the MySQL database
        String jdbcUrl = "jdbc:mysql://localhost:3306/newDBs";
        String username = "root";
        String password = "Ankur@19";
        Map<String, String> input = new HashMap<>();

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            String insertDataSQL = "INSERT INTO FormRegistration (userName, value) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertDataSQL);

            for (Map.Entry<String, String> entry : input.entrySet()) {
                preparedStatement.setString(1, entry.getKey());
                preparedStatement.setString(2, entry.getValue());
                preparedStatement.executeUpdate();
            }

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

