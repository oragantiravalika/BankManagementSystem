package com.oops;

class Payment {
	void processPayment() {
		System.out.println("Processing Payment");
	}
}

class CreditCard extends Payment {
	void processPayment() {
		System.out.println("Payment done using Credit Card");
	}
}

class DebitCard extends Payment {
	void processPayment() {
		System.out.println("Payment done using Debit Card");
	}
}

class UPI extends Payment {
	void processPayment() {
		System.out.println("Payment done using UPI");
	}
}

public class Main1 {
	public static void main(String[] args) {

		Payment p;

		p = new CreditCard();
		p.processPayment();

		p = new DebitCard();
		p.processPayment();

		p = new UPI();
		p.processPayment();
	}
}