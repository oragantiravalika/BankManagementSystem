package com.javaArrays;

public class Numcount {

	public static void main(String[] args) {

		int[] arr = { 123, 222, 234, 125 };
		int target = 2;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			while (n > 0) {
				int rem = n % 10;
				if (rem == target) {
					count++;
				}

				n = n / 10;
			}
		}

		System.out.println("The appearance of " + target + " is: " + count);
	}
}
