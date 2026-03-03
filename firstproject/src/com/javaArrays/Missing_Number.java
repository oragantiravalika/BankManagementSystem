package com.javaArrays;

public class Missing_Number {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 6 };
		int max = arr[0];
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			if(arr[i]>max) {
				max=arr[i];
			}
		}
			int expectedsum = (max*(max+1))/2;
			int missing = expectedsum-sum;
			System.out.println("missing element is:"+missing);
		}
	}


