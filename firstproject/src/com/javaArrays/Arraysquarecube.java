package com.javaArrays;

public class Arraysquarecube {

	public static void main(String[] args) {
		int[][] arr = { { 2, 4, 3 }, { 5, 8, 1 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] % 2 == 0) {
					arr[i][j] = arr[i][j] * arr[i][j];
				} else {
					arr[i][j] = arr[i][j] * arr[i][j] * arr[i][j];

				}

			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
