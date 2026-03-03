package com.logicalstatements;

import java.util.Scanner;

public class Logical4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks for subject 1: ");
		int m1 = sc.nextInt();

		System.out.print("Enter marks for subject 2: ");
		int m2 = sc.nextInt();

		System.out.print("Enter marks for subject 3: ");
		int m3 = sc.nextInt();

		System.out.print("Enter marks for subject 4: ");
		int m4 = sc.nextInt();

		System.out.print("Enter marks for subject 5: ");
		int m5 = sc.nextInt();

		System.out.print("Enter marks for subject 6: ");
		int m6 = sc.nextInt();
		if (m1 >= 0 && m1 <= 100 && m2 >= 0 && m2 <= 100 && m3 >= 0 && m3 <= 100 && m4 >= 0 && m4 <= 100 && m5 >= 0
				&& m5 <= 100 && m6 >= 0 && m6 <= 100) {

			int total = m1 + m2 + m3 + m4 + m5 + m6;
			double average = total / 6.0;

			System.out.println("\nTotal Marks = " + total);
			System.out.println("Average Marks = " + average);

			if (total >= 540 && total <= 600) {
				System.out.println("Grade: A+");
			} else if (total >= 450 && total <= 539) {
				System.out.println("Grade: A");
			} else if (total >= 360 && total <= 449) {
				System.out.println("Grade: B");
			} else if (total >= 270 && total <= 359) {
				System.out.println("Grade: C");
			} else {
				System.out.println("Grade: Fail");
			}

		} else {
			System.out.println("Invalid marks! Marks should be between 0 and 100.");
		}

		sc.close();

	}
}
