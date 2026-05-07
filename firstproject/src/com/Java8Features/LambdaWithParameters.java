package com.Java8Features;
 interface add{
	 int sum(int a, int b);
	 
 }
public class LambdaWithParameters {
	public static void main(String[] args) {
		add a= (x,y)->x+y;
		System.out.println("Sum = " + a.sum(5, 10));
	}

}
