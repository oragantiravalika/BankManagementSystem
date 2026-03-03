package com.logicalstatements;

import java.util.Scanner;

public class Logical5 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println("factorial of" + num + "is:" + factorial);

		sc.close(); 
	}
}
