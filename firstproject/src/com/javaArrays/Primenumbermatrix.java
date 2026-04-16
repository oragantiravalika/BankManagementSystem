package com.javaArrays;

import java.util.Scanner;

public class Primenumbermatrix {
	private static boolean isprime(int i) {
		if (i == 0 || i == 1) {
			return false;
		}
		for (int j = 2; j < i; j++) {
			while (i % j == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size:");
		int[][] arr = new int[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
 //display
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
	}
int primenumber =2;
}
}
