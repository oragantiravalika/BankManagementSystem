package com.advancejava;

import java.sql.*;

public class EmployeeInsert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b69", "root", "ravalika");

			String query = "INSERT INTO employee VALUES (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, 102);
			ps.setString(2, "Arjun");
			ps.setString(3, "IT");
			ps.setInt(4, 45000);
			ps.executeUpdate();

			System.out.println("Employee inserted successfully");

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
