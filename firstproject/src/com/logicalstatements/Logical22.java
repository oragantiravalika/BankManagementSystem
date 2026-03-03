package com.logicalstatements;

import java.util.Scanner;

public class Logical22 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();

		int temp = n;
		int r, sum = 0;

		while (n > 0) {
			r = n % 10;
			sum = sum + (r * r * r);
			n = n / 10;
		}

		if (temp == sum) {
			System.out.println("Given number is Armstrong Number");
		} else {
			System.out.println("Given number is Not an Armstrong Number");
		}

		sc.close();
	}
}
