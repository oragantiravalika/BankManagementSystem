package com.javaArrays;

//even rows should reverse
//odd rows should *2
//daignol rows should sqaure 
public class Arraymatrix {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) { // even row → reverse
				for (int j = arr.length - 1; j >= 0; j--) {

					if (i == j) { // diagonal
						System.out.print(arr[i][j] * arr[i][j] + " ");
					} else {
						System.out.print(arr[i][j] + " ");
					}

				}
			} else { // odd row → multiply by 2
				for (int j = 0; j < arr.length; j++) {

					if (i == j) { // diagonal
						System.out.print(arr[i][j] * arr[i][j] + " ");
					} else {
						System.out.print(arr[i][j] * 2 + " ");
					}

				}
			}

			System.out.println();
		}

	}
}