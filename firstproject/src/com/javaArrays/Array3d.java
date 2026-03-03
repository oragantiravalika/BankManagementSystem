package com.javaArrays;

import java.util.Scanner;

public class Array3d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array elements:");
		int size = sc.nextInt();
		int arr[][][] = new int[2][3][4];
		
		for (int i = 0; i < 2; i++) {
			 System.out.println("Layer " + (i + 1) + ":");
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 4; k++) {
					arr[i][j][k] = sc.nextInt();
				}
			}
			System.out.println("3d array is:");
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 4; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
		}
		System.out.println();
		sc.close();
	}
}
