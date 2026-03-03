package com.javaArrays;

import java.util.Arrays;

public class Arraymerge {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 4, 5, 6, 7 };

		int merged[] = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr2.length; i++) {
			merged[i] = arr2[i];
		}
		for (int i = 0; i < arr1.length; i++) {
			merged[i + arr2.length] = arr1[i];
		}
		System.out.println(Arrays.toString(merged));

	}
}