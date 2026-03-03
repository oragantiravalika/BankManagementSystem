package com.javaintro;

public class Student1 {
	static int Id = 10;
	String name;
	long mobile;
	static void show() {
		Student1 s= new Student1();
		s.name = "darla";
		s.mobile = 9959090859l;
		s.display();
		
		
	}
void display() {
	System.out.println("Id:"+Id);
	System.out.println("name:"+name);
	System.out.println("mobile:"+mobile);
}

	public static void main(String[] args) {
		Student1.show();
		
	}

}
