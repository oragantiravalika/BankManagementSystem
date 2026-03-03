package com.javaArrays;

public class Evenodd {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) {

				arr[i] = arr[i] * arr[i];
			} else {

				arr[i] = arr[i] * 2;
			}
		}

		for (int value : arr) {
			System.out.print(value + " ");
		}
	}
}
