package com.logicalstatements;

import java.util.Scanner;

public class Logical2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		age = sc.nextInt();

		if (age < 10) {
			System.out.println("Kid");
		} else if (age < 13) {
			System.out.println("children");
		} else if (age < 20) {
			System.out.println("Teenager");

		} else if (age < 60) {
			System.out.println("Adult");
		} else if (age > 60) {
			System.out.println("Old");
		}
		sc.close();
	}
}
