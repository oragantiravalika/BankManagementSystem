package com.logicalstatements;

import java.util.Scanner;

public class Logical3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Right to vote:");
		age = sc.nextInt();

		if (age > 18)

		{
			System.out.println("eligible to vote");
		} else if (age < 18) {
			System.out.println("not eligible to vote");

		} else if (age >= 18) {
			System.out.println("eligible to vote");
		}
		System.out.println("main method ended");
		sc.close();
	}
}