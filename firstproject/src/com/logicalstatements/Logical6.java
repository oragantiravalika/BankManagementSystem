package com.logicalstatements;

public class Logical6 {
	static boolean isperfect(int n) {
		int sum = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}

		return sum == n;
	}

	public static void main(String[] args) {
		System.out.println("Main method started");

		char ch = 'A';

		for (int i = 1; i <= 26; i++) {
			if (isperfect(i)) {
				System.out.println("Perfect Alphabet: " + ch + " = " + i);
			}
			ch++;
		}

		System.out.println("Main method ended");
	}

}
