package com.logicalstatements;

import java.util.Scanner;

public class Logical7 {
	
	 static boolean isPerfect(int n) {
	        int sum = 0;

	        for (int i = 1; i <= n / 2; i++) {
	            if (n % i == 0) {
	                sum = sum + i;
	            }
	        }

	        return sum == n;
	    }

	    public static void main(String[] args) {
	        System.out.println("Main method started");

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        if (isPerfect(num)) {
	            System.out.println(num + " is a Perfect Number");
	        } else {
	            System.out.println(num + " is NOT a Perfect Number");
	        }

	        System.out.println("Main method ended");
	        sc.close();
	    }
	}