package com.example.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Exampleupdate {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hospitalitydb", "root", "8870"
            );
            Statement smt = con.createStatement();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.println("Enter employee ID to update (or type 'exit' to quit):");
                String input = br.readLine();
                if (input.equalsIgnoreCase("exit")) break;

                int eno = Integer.parseInt(input);

                System.out.println("Enter new salary for employee ID " + eno + ":");
                int esal = Integer.parseInt(br.readLine());

                int count = smt.executeUpdate("UPDATE employee SET esal = " + esal + " WHERE eno = " + eno);

                if (count > 0) {
                    System.out.println(count + " record(s) updated.");
                } else {
                    System.out.println("No record updated. Please check the employee ID.");
                }
            }

            // Clean-up
            smt.close();
            con.close();
            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
