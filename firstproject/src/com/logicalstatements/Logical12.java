package com.logicalstatements;

import java.util.Scanner;

public class Logical12 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");

		int n = sc.nextInt();// 163
		int r = 0;

		int rev = 0;
		while (n != 0) {
			r = n % 10;// 163%10=163
			n = n / 10;// 163/10=63
			rev = rev * 10 + r; 
		}
		System.out.println("Reversed Number: " + rev);
		System.out.println("Main Method Ended");

		sc.close();

	}
}
