package com.logicalstatements;

import java.util.Scanner;

public class Logical20 {

	public static void main(String[] args) {
		System.out.println("main method started");

		int rem = 0;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();

		while (n != 0) {
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}

		System.out.println("sum of given number is:" + sum);
        sc.close();
	}
}
