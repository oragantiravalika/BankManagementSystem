package com.javaintro;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method started");

		Class.forName("com.mysql.cj.jdbc.Driver");

		System.out.println("main method ended");

	}

}
