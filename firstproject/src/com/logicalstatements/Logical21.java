package com.logicalstatements;

import java.util.Scanner;

public class Logical21 {

	static int sumOfDigits(int n) {
		int sum = 0;
		int rem = 0;

		while (n != 0) {
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}

		if (sum > 9) {

			return sumOfDigits(sum);

		}

		else {
			if (sum == 1) {
				System.out.println("it is a magicnumber");
			} else {
				System.out.println("it is not a magicnumber");
			}
			return sum;
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();

		System.out.println(sumOfDigits(n));

		sc.close();
	}
}