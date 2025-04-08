package com.example.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Exampleinsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalitydb","root","8870");
			//prepare statement
			PreparedStatement psmt = con.prepareStatement("insert into employee values(?,?,?)");
			//scanner
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//insert
			while(true) {
				System.out.println("Enter emp id:");
				int eno = Integer.parseInt(br.readLine());
				System.out.println("Enter the emp name");
				String ename = br.readLine();
				System.out.println("Enter the emp sal");
				int esal = Integer.parseInt(br.readLine());
				//psmt
				psmt.setInt(1,eno);
				psmt.setString(2,ename);
				psmt.setInt(3,esal);
				int count = psmt.executeUpdate();
				if(count>0) {
					System.out.println(count+"record inserted");
					}
				else {
					System.out.println("no record inserted");
				}
				//choice
				System.out.println("Do want to insert more records");
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
