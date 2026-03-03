package com.javaArrays;

class Address {
	String city;
}

class Person {
	String name;
	Address address;

	Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}
}

public class Test1 {
	public static void main(String[] args) {

		Address addr = new Address();
		addr.city = "Hyderabad";

		Person p1 = new Person("Ram", addr);
		Person p2 = p1;

		p2.address.city = "Delhi";

		System.out.println(p1.address.city);
	}
}