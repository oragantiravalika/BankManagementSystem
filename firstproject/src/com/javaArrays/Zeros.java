package com.javaArrays;

public class Zeros {

	public static void main(String[] args) {

		int arr[] = { 1, 2, -3, 4, -7, 6, -9, 3 };

		int j = 0;
		int k = 0;

		while (j < arr.length || k < arr.length) {

			Integer pos = null;
			Integer neg = null;

			// Find next positive
			while (j < arr.length) {
				if (arr[j] > 0) {
					pos = arr[j];
					j++;
					break;
				}
				j++;
			}

			// Find next negative
			while (k < arr.length) {
				if (arr[k] < 0) {
					neg = arr[k];
					k++;
					break;
				}
				k++;
			}

			// Print cases
			if (pos != null && neg != null) {
				System.out.println(pos + "," + neg);
			} else if (pos != null) { // Extra positive
				System.out.println(pos);
			} else if (neg != null) { // Extra negative
				System.out.println(neg);
			} else {
				break;
			}
		}
	}
}