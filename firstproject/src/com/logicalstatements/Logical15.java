package com.logicalstatements;

import java.util.Scanner;

public class Logical15 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int originalNum = num;
		int sum = 0;

		while (num != 0) {
			int digit = num % 10;
			int fact = 1;

			for (int i = 1; i <= digit; i++) {
				fact = fact * i;
			}

			sum = sum + fact;
			num = num / 10;
		}

		if (sum == originalNum) {
			System.out.println("The given number is Strong Number");
		} else {
			System.out.println("The given number is NOT a Strong Number");
		}

		System.out.println("Main Method Ended");
		sc.close();
	}
}
