package com.languagefundamentals;


import java.util.Scanner;



public class ChainingMethod {

	//with arguments + with return type



	public static void main(String[] args) {

		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("eneter a value");

		int a = sc.nextInt();

		System.out.println("eneter b value");

		int b = sc.nextInt(); 

		ChainingMethod c=new ChainingMethod();

		int g=c.addition(a,b);

		System.out.println(g);

		int h=c.sub(c.addition(a,b), b);

		System.out.println(h);

		int s=c.mul(h, b);

		System.out.println(s);

		// another method of addition,subtraction,multiplication

		int j = c.sub(c.addition(a,b),b);

		System.out.println(j);

		int i=c.mul(c.sub(c.addition(a,b),b),b);

		System.out.println(i);

		sc.close();

		

		

	}

	int addition(int a, int b) {

		int add = a + b;

	return add;

	}

	int sub(int a, int b) {

		int s = a - b;

	return s;

	}		

	int mul(int a, int b) {

		int m = a*b;

	return m;

	}



}

