package com.logicalstatements;

import java.util.Scanner;

public class Logical11 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		int n1 = 0;
		int n2= 1;
		int n3 = 0;
		if (n1== 1) {
			System.out.println(" Fibonacci number is:" + n1);
		}

		else if (n2== 2) {
			System.out.println("Fibonacci number is:" + n2);
		} else {
			for (int i = 3; i <= n; i++) {
				n3= n1 + n2;
				n1 = n2;
				n2 = n3;

			}
			System.out.println(" Fibonacci number is:" + n3);
		}
		System.out.println("main method ended");
		sc.close();
	}
}
