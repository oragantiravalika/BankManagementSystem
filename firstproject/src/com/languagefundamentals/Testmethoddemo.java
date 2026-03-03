package com.languagefundamentals;

import java.util.Scanner;

public class Testmethoddemo {

	//WAP to print about you..? By using methods and scanner ..? {

		public static void main(String[] args) {
			System.out.println("main method started !!");
			
			Testmethoddemo t = new Testmethoddemo();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your first name : ");
			String fn = sc.next();

			System.out.println("Enter your last name : ");
			String ln = sc.next();
			
			System.out.println("Enter your address : ");
			String hno = sc.next();
			
			System.out.println("Enter your mobileno : ");
			long mno = sc.nextLong();
			
			System.out.println("Enter your salary : ");
			float sal = sc.nextFloat();

			// Calling method by passing the values : Call by value
	       //t.getName(fn, ln, hno, mno, sal);
	      // The method getName(String, String, String, long, float) is undefined for the type Testmethoddemo
			
		}

		void getDetails(String fname, String lname, String address, long mno, float sal) {
	        System.out.println("\n--- My Details ---");
	        System.out.println("Full Name : " + fname + " " + lname);
	        System.out.println("Address   : " + address);
	        System.out.println("Mobile No : " + mno);
	        System.out.println("Salary    : " + sal);
		}
         
}    


	

	