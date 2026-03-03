package com.javaArrays;

public class Sumcount {

	public static void main(String[] args) {
		int arr[] = { 12, 34, 54, 67 };

		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			int rem = 0;
			int sum = 0;
			while (n != 0) {
				rem = n % 10;
				sum = sum + rem;
				n = n / 10;

			}
			System.out.println(arr[i] + "" + sum);
		}
	}
}
