package com.javaArrays;

import java.util.Scanner;

public class Arrayrowcolumn {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size1:");
		int a = sc.nextInt();
		System.out.println("enter size2:");
		int b = sc.nextInt();
		int arr[][] = new int[a][b];

		System.out.println("enter array elements:");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("***********");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("**********");
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println("*************");
		for (int i = 0; i < b; i++) {
			for (int j = a - 1; j >= 0; j--) {
				System.out.print(arr[j][i] + " ");
			}
		}
		sc.close();
	}

}
