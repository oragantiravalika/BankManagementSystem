package com.javaArrays;

import java.util.Scanner;
//input:(1,12,15,133,2)
//output:(11,122,152,1333,21)

public class ArrayDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the array elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			int count = 0;
			int temp = arr[i];
			while (temp > 0) {
				temp = temp / 10;
				count++;
			}
			arr[i] = (arr[i] * 10) + count;
		}
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
			sc.close();
		}
	}

}
