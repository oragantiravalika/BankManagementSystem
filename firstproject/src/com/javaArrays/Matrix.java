package com.javaArrays;

public class Matrix {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 1 }, { 3, 0, 4 }, { 1, 5, 1 } };

		int rows = arr.length;
		int cols = arr[0].length;

		boolean row[] = new boolean[rows];
		boolean col[] = new boolean[cols];

		// Step 1: Find positions of 0
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				if (arr[i][j] == 0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}

		// Step 2: Convert rows to 0
		for (int i = 0; i < rows; i++) {
			if (row[i] == true) {
				for (int j = 0; j < cols; j++) {
					arr[i][j] = 0;
				}
			}
		}

		// Step 3: Convert columns to 0
		for (int j = 0; j < cols; j++) {
			if (col[j] == true) {
				for (int i = 0; i < rows; i++) {
					arr[i][j] = 0;
				}
			}
		}

		// Step 4: Print matrix
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
