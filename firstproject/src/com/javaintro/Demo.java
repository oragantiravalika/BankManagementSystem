package com.javaintro;

public class Demo {
	static int age = 22;
	long mobileNo; 
	static {
		System.out.println("age:"+age);
}
	{
		System.out.println("mobileNo:"+mobileNo);
	}
	static void show() {
		String name = "jessy";
		System.out.println("name:"+name);
	}
	
		void display() {
		int Id = 505;
		System.out.println("Id:"+Id);
		}
		

	public static void main(String[] args) {
		Demo d = new Demo();
		d.mobileNo = 506;
		System.out.println("mobileNo:"+d.mobileNo);
		
		d.display();
		show();
		
		
		
	}

}
