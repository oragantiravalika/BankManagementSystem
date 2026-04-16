package com.bank;

public class Bank {

	Customer customer; // one customer
	Transaction lastTxn; // last transaction

	public void createCustomer(String name, int age, String accNo, double balance) {
		Account acc = new Account(accNo, balance);
		customer = new Customer(name, age, acc);
		System.out.println("Customer Created!");
	}

	public void deposit(double amount) {
	        if (customer != null) {
	            customer.account.deposit(amount);
	            lastTxn = new Transaction("Deposit", amount);
	        } else {
	            System.out.println("No Customer Found!");	        }
	    }

	public void withdraw(double amount) {
		if (customer != null) {
			customer.account.withdraw(amount);
			lastTxn = new Transaction("Withdraw", amount);
		} else {
			System.out.println("No Customer Found!");
		}
	}

	public void showCustomer() {
		if (customer != null) {
			customer.showCustomer();
		} else {
			System.out.println("No Customer Found!");
		}
	}

	public void showLastTransaction() {
		if (lastTxn != null) {
			lastTxn.show();
		} else {
			System.out.println("No Transactions Yet!");
		}
	}
}
