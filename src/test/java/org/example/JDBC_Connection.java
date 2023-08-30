package org.example;

import org.testng.annotations.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

@Test
public class JDBC_Connection {
    public void createDataBase() {
        try {
            String url="jdbc:mysql://localhost:3306";
            String userName="root";
            String password="Ankur@19";
            Connection conn= DriverManager.getConnection(url,userName,password);
            Statement stn =conn.createStatement();
            String query="create database NewDB";
            boolean ben=stn.execute(query);
            System.out.println("Pass-200-OK");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void createTable() {
        try {
            String url="jdbc:mysql://localhost:3306/NewDB";
            String userName="root";
            String password="Ankur@19";
            Connection conn= DriverManager.getConnection(url,userName,password);
            Statement stn =conn.createStatement();
            String query="CREATE TABLE value (username VARCHAR(200), password VARCHAR(200))";
            boolean ben=stn.execute(query);
            System.out.println("Table Pass-200-OK");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
