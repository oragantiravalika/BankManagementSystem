package com.javaArrays;

import java.util.Arrays;

public class Selectionsort {

	public static void main(String[] args) {

		int arr[] = { 6, 5, 3, 4, 1, 2 };
		System.out.println("Before sorting:");
		System.out.println(Arrays.toString(arr));

		// Selection sort logic
		for (int i = 0; i < arr.length - 1; i++) {

			int minIndex = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

		System.out.println("Sorted array:");
		System.out.println(Arrays.toString(arr));
	}
}
