package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchEmployees {

    public static void main(String[] args) {
        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to DB
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hospitalitydb", "root", "8870"
            );

            Statement smt = con.createStatement();

            // Execute query
            ResultSet rs = smt.executeQuery("SELECT * FROM employee");

            // Print result
            while (rs.next()) {
                int eno = rs.getInt("eno");
                String ename = rs.getString("ename");
                int esal = rs.getInt("esal");

                System.out.println("ID: " + eno + ", Name: " + ename + ", Salary: " + esal);
            }

            // Cleanup
            rs.close();
            smt.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

