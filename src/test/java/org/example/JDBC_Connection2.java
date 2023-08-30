package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection2 {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/newDBs";
        String username = "root";
        String password = "Ankur@19";

        try {
            // Create a connection to the database
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // Create a table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS FormRegistration (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "userName VARCHAR(255)," +
                    "value VARCHAR(255)" +
                    ")";
            statement.executeUpdate(createTableSQL);

            // Insert data into the table
            String insertDataSQL = "INSERT INTO FormRegistration (userName, value) VALUES " +
                    "('first_name', 'abcd')," +
                    "('last_name', 'efgh')," +
                    "('email', 'abcd@gmail.com')," +
                    "('phone', '1234567890')," +
                    "('address', 'Hinjewadi Pune, Maharashtra')," +
                    "('city', 'Pune')," +
                    "('zip', '1057')," +
                    "('website', 'www.google.com')," +
                    "('comment', 'CP-SET Certified')";
            statement.executeUpdate(insertDataSQL);

            // Close the resources
            statement.close();
            connection.close();

            System.out.println("Data inserted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}

