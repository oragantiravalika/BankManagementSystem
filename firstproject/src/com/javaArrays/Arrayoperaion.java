package com.javaArrays;

import java.util.Scanner;

public class Arrayoperaion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 🔹 Most Repeated Element
        int maxCount = 0;
        int mostRepeated = arr[0];

        for(int i = 0; i < n; i++) {
            int count = 0;

            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }

            if(count > maxCount) {
                maxCount = count;
                mostRepeated = arr[i];
            }
        }

        System.out.println("Most Repeated Element: " + mostRepeated);

        // 🔹 Second Max
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } 
            else if(arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second Max: " + secondMax);

        // 🔹 Second Min
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            if(arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } 
            else if(arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }

        System.out.println("Second Min: " + secondMin);

        sc.close();
    }
}
	
