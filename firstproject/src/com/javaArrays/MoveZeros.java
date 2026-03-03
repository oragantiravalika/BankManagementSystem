package com.javaArrays;

import java.util.Scanner;

public class MoveZeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the array elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[temp] = arr[i];
				temp++;

			}
		}
		while (temp < size) {
			arr[temp] = 0;
			temp++;

		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
			sc.close();
		}
	}
}
