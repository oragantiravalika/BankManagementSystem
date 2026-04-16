package com.bank;

public class Customer {

	String name;
	int age;
	Account account;

	public Customer(String name, int age, Account account) {
		this.name = name;
		this.age = age;
		this.account = account;
	}

	public void showCustomer() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		account.display();
	}
}
