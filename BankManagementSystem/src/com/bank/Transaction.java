package com.bank;

public class Transaction {

	String type;
	double amount;

	public Transaction(String type, double amount) {
		this.type = type;
		this.amount = amount;
	}

	public void show() {
		System.out.println(type + " -> " + amount);
	}
}
