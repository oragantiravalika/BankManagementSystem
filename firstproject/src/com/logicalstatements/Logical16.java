package com.logicalstatements;

public class Logical16 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int n = 6;
		for (int i = 1; i <= 10; i++) {

			System.out.println("hello");

			if (n < 5) {
				break;
			}
			System.out.println("hello again");
			if (n < 5)
				continue;
			System.out.println("main method ended");

		}
	}
}
