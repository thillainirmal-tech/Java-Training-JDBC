package com.example.jdbc;
import java.sql.DriverManager;
import java.sql.Statement;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;


public class DeleteUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalitydb","root","8870");
		Statement smt = con.createStatement();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Enter deletion emp id");
			int eno = Integer.parseInt(br.readLine());
			int count = smt.executeUpdate("delete from employee where eno ="+eno);
			if(count == 1) {
				System.out.println(count+"record is deleted");
			}
			else {
				System.out.println("no record deleted");
			}
			System.out.println("Do wont to delete more record");
			String ch = br.readLine();
			if(ch.equalsIgnoreCase("no")) {
				break;
			}
		}
		
	}catch(Exception e) {
		System.out.println(e);
	}

}
	}

