package com.logicalstatements;

import java.util.Scanner;

public class Logical17 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Decimal Number");
		int n = sc.nextInt();
		int rem = 0;
		//String s = Integer.toBinaryString(n);
		String s1 = " ";
		while (n != 0) {
			rem = n % 2;
			n = n / 2;
			s1 = rem + s1;
		}
		System.out.println(s1);
		
		System.out.println("Main Mehod Ended");
		sc.close();
	}
}
