package com.logicalstatements;

import java.util.Scanner;

public class Logical23 {
	static int sum(int num) {
		int rem = 0;
		int sum = 0;
		int r = 0;
		while (num != 0) {
			rem = num % 10;
			num = num / 10;
			sum = sum + rem;
		}
		return sum;

	}

	static int prod(int num) {
		int rem = 0;
		int pro = 0;
		int r = 0;
		while (num != 0) {
			rem = num % 10;
			num = num / 10;
			pro = pro * rem;
		}
		return pro;

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num = sc.nextInt();

		int rem = 0;

		int sum1 = sum(num);
		int pro = prod(num);

		if (sum1 == pro) {
			System.out.println("Given number is spy: " + num);
		} else {
			System.out.println("Given number is not a spy:" + num);
		}

		sc.close();
	}

}
