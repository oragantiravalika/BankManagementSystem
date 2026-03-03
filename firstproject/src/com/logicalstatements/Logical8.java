package com.logicalstatements;

public class Logical8 {

	public static void main(String[] args) {
		System.out.println("Perfect numbers between 1 and 100:");

		for (int n = 1; n <= 100; n++) {
			int sum = 0;

			// Find factors
			for (int i = 1; i <= n / 2; i++) {
				if (n % i == 0) {
					sum = sum + i;
				}
			}

			// Check perfect number
			if (sum == n && n != 0) {
				System.out.println(n);
			}
		}

		System.out.println("Program ended");
	}
}
