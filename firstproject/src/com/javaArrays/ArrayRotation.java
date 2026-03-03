package com.javaArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
	public static void main(String[] args) {
		// { 1, 3, 7, 9, 20, 10, 19, 7 }

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int mid = arr.length / 2;

		Arrays.sort(arr, 0, mid);

		Arrays.sort(arr, mid + 1, arr.length);

		int start = mid + 1;
		int end = arr.length - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

		System.out.println("Output:");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		sc.close();
	}
}
