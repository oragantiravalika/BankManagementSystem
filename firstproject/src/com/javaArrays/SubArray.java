package com.javaArrays;

public class SubArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 2, 3, 4, 5, 7, 5, 6, 7, 8, 9 };
		int count = 1;
		int max = 1;
		int endindex = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - arr[i - 1] == 1) {
				count++;

			} else {
				count = 1;

			}
			if (count > max) {
				max = count;
				endindex = i;
			}
		}

		System.out.println("max value:" + max);
		for (int i = endindex - max + 1; i <= endindex; i++) {
			System.out.print(arr[i] + "");
		}

	}
}
