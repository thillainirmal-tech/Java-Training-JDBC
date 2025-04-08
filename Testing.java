package com.example.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Testing {
    public static void main(String[] args) {
    	String url = "jdbc:mysql://localhost:3306/hospitalitydb";
    	String username = "root"; // replace with your username
        String password = "8870"; // replace with your password

        try {
            // Optional from JDBC 4.0, but safe to include
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("✅ Connection successful!");
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

