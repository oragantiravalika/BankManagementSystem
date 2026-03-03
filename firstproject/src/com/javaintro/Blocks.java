package com.javaintro;

public class Blocks {
	static {
		System.out.println("static block1");
	
	}
static {
	System.out.println("static block2");
	
}


	public static void main(String[] args) {
	
		System.out.println("main method");
	System.out.println("instance block");
	}
		
   Blocks b = new Blocks();


	}


