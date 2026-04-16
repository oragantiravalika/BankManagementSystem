package com.oops;

import java.util.Scanner;

class Main2 {
	private String Username;
	private String password;

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return password;
	}

	public  String setPassword(String password) {
		return this.password = password;
	}
}

	public class User {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter inputs:");
			String Username = sc.next();
			String password = sc.next();

			Main2 m = new Main2();
			m.setUsername(Username);
			String pass=m.setPassword(password);
			if (pass.length() < 6) {
				System.out.println("weak password");

			} else {
				System.out.println("condition true!!");
			}
			sc.close();
		}

	}

