package com.javaintro;

public class Data {
	static int age;
	long mobile;
	float d;
	double salary;
	char name;
	boolean female;
	public void display() {
		age = 22;
		mobile  = 9959090859l;
		d= 22.1f;
		salary = 30000;
		name = 'R';
		female = true;
	}
	
	

	public static void main(String[] args) {
		Data b = new Data();
		    age = 22;
			b.mobile  = 9959090859l;
			b.d= 22.1f;
			b.salary = 30000;
			b.name = 'R';
			b.female = true;
				
		System.out.println("age:"+age);
		System.out.println("mobile:"+b.mobile);
		System.out.println("d:"+b.d);
		System.out.println("name:"+b.name);
		System.out.println("salary:"+b.salary);
		System.out.println("female:"+b.female);
		
	}
}
		
		
		
		
	


