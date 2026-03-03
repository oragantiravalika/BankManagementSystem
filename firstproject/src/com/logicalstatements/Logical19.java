package com.logicalstatements;

import java.util.Scanner;

public class Logical19 {

	public static void main(String[] args) {
		System.out.println("Main method started");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a binary number: ");
		int binary = sc.nextInt();

		int decimal = 0;
		int power = 0;

		while (binary > 0) {
			int digit = binary % 10;
			decimal = decimal + digit * (int) Math.pow(2, power);
			power++;
			binary = binary / 10;
		}

		System.out.println("Decimal value: " + decimal);
		System.out.println("Main method ended");
		sc.close();
	}
}
