package com.javaArrays;

public class StudentMarks {

	public static void main(String[] args) {
		int arr[] = { 28, 36, 24, 18, 45, 52 };
		for (int i = 0; i < arr.length; i++) {
			int remainder = arr[i] % 10;
			if (remainder > 5) {
				arr[i] = arr[i] + (10 - remainder);
			} else {
				arr[i] = arr[i] - remainder;

			}
			System.out.println(arr[i]);
		}
	}

}
