package com.javaArrays;

import java.util.Scanner;

public class Blocks {

	public static void main(String[] args) {

		System.out.println("Enter the size:");
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter the elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		// Forward comparison block
		System.out.println("Forward block:");

		for (int i = 0; i < arr.length - 1; i++) {
			int count = 0;

			if (arr[i] < arr[i + 1]) {
				count = arr[i] + arr[i + 1];
			} else {
				count = arr[i];
			}

			System.out.println(count);
		}

		// Backward comparison block
		System.out.println("Backward block:");

		for (int i = arr.length - 1; i > 0; i--) {
			int count = 0;

			if (arr[i] < arr[i - 1]) {
				count = arr[i] * arr[i - 1];
			} else {
				count = arr[i];
			}

			System.out.println(count);
		}

		sc.close();
	}
}