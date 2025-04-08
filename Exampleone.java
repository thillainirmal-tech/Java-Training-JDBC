package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Exampleone {

    public static void main(String[] args) {
        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hospitalitydb", "root", "8870");

            // Create statement
            Statement smt = con.createStatement();

            // Create table
            smt.executeUpdate("CREATE TABLE employee (eno INT, ename VARCHAR(30), esal INT)");

            System.out.println(" Table Created Successfully");
            con.close();

        } catch (Exception e) {
            System.out.println(" Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

