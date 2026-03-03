package com.logicalstatements;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		System.out.println("main method started");
		 int marks;
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter marks: ");
	        marks = sc.nextInt();

	        if (marks >= 90) {
	            System.out.println("Grade A");
	        }
	        else if (marks >= 75) {
	            System.out.println("Grade B");
	        }
	        else if (marks >= 60) {
	            System.out.println("Grade C");
	        }
	        else if(marks>=35){
	            System.out.println("Fail");
	            System.out.println("main method ended");
	        }
	        sc.close();
	    }
	}