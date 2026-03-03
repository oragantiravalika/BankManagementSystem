package com.Patterns;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) { // rows
			for (int j = i; j >= 1; j--) { // numbers in reverse
				System.out.print(j + " ");
			}
			System.out.println(); // move to next line
		}

		sc.close();
	}
}
