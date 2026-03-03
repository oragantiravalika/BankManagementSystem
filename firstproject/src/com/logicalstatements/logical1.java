package com.logicalstatements;

import java.util.Scanner;

public class logical1 {

	public static void main(String[] args) {
System.out.println("main method started!!");
Scanner sc = new Scanner(System.in);

// Input marks
System.out.print("Enter Marks: ");
int marks = sc.nextInt();

// Input attendance
System.out.print("Enter Attendance Percentage: ");
double attendance = sc.nextDouble();

// Condition check
if (marks > 50 && marks < 100 && attendance > 80 && attendance < 100) {
    System.out.println("Student is Eligible for Scholarship");
    System.out.println("Scholarship Amount: ₹10,000");
} else {
    System.out.println("Student is NOT Eligible for Scholarship");
}
System.out.println("main method ended");
sc.close();
}
}