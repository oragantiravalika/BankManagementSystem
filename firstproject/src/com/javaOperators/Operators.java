package com.javaOperators;

import java.util.Scanner;

public class Operators {
	int a = 50;
	int b = 60;
	static Scanner sc = new Scanner(System.in); 
	static void add(int a, int b) {
		System.out.println("enter a value:");
		 a = sc.nextInt();
		System.out.println("enter b value:");
	     b = sc.nextInt();
	     System.out.println("sum of two numbers:"+(a+b));
	}
	static void mul(int a, int b) {
		System.out.println("enter a number:");
		a =sc.nextInt();
		System.out.println("enter b number:");
		b = sc.nextInt();
		System.out.println("product of two numbers:"+(a*b));
	}
	 void sub(Operators Op) {
		 add(Op.a , Op.b);
		System.out.println("enter a value:");
		a = sc.nextInt();
		System.out.println("enter b value:");
	     b = sc.nextInt();
	     System.out.println("difference of two numbers:"+(a-b));
	}
	void div(Operators Op) {
		mul(Op.a , Op.b);
		System.out.println("enter a number:");
        a = sc.nextInt();
        System.out.println("enter b number:");
        b = sc.nextInt();
        System.out.println("division of two numbers:"+(a/b));
	}   
     public static void main(String[] args) {
    	 Operators Op = new Operators();
    	 Op.sub(Op);
    	 Op.div(Op);

	}

}
