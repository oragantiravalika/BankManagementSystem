package com.javaArrays;

public class FirstpositiveFirstnegative {

	public static void main(String[] args) {
		int arr[] = {1, 2, -3, 4, -7, 6, -9, 3};
		int j = 0;
		int k = 0;
		while (j < arr.length || k < arr.length) {
			int pos = 0;
			int neg = 0;

			while (j < arr.length) {
				if (arr[j] > 0) {
					pos = arr[j];
					j++;
					break;
				} else {
					j++;
				}

			}
			while (k < arr.length) {
				if (arr[k] < 0) {
					neg = arr[k];
					k++;
					break;
				} else {
					k++;
				}
			}

			if (pos != 0 || neg != 0) {
				System.out.println(pos + "," + neg);
			} else {
				break;
			}
		}
	}
}
