package com.Patterns;

public class Bothpatterns {

	public static void main(String[] args) {
		int n = 6;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		// int n = 6;
		for (int i = 6-1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
