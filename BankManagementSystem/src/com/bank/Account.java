package com.bank;

class Account {

	String accNo;
	double balance;

	public Account(String accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: " + amount);
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Insufficient Balance!");
		}
	}

	public void display() {
		System.out.println("Account No: " + accNo);
		System.out.println("Balance: " + balance);
	}
}