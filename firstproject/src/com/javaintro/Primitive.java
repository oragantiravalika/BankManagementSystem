package com.javaintro;

public class Primitive {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean boo;
	void display() {
		System.out.println("byte:"+ b);
		System.out.println("short"+s);
		System.out.println("int"+i);
		System.out.println("float"+f);
		System.out.println("double"+d);
		System.out.println("char"+c);
		System.out.println("boolean"+boo);
		
	}

	public static void main(String[] args) {
		Primitive p = new Primitive();
		p.display();

	}

}
