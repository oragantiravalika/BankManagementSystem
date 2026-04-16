package com.string;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) {

		try {
			// 1. Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

		    // 2. Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b69", "root", "ravalika");

			// 3. Create Statement
			Statement st = con.createStatement();

			// 4. Execute Query
			ResultSet r = st.executeQuery("SELECT * FROM emp");

			// 5. Process Data (Corrected)
			while (r.next()) {
				int empno = r.getInt("empno"); // number
				String ename = r.getString("ename"); // text
				String job = r.getString("job"); // text (CLERK, MANAGER)
				double sal = r.getDouble("sal"); // number

				System.out.println(empno + " " + ename + " " + job + " " + sal);
			}

			// 6. Close Resources
			r.close();
			st.close();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
