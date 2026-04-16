package com.oops;

public class Bank {

	int rate = 5;

	int getRate() {
		return rate;
	}
}

class SBI extends Bank {
	int rate = 6;

	int getRate() {
		return rate;
	}
}

class HDFC extends Bank {
	int rate = 7;

	int getRate() {
		return rate;
	}
}

class ICICI extends Bank {
	int rate = 8;

	int getRate() {
		return rate;
	}
}

class BankInterest {
	public static void main(String[] args) {

		Bank b;

		b = new SBI();
		System.out.println("SBI Interest Rate: " + b.getRate() + "%");

		b = new HDFC();
		System.out.println("HDFC Interest Rate: " + b.getRate() + "%");

		b = new ICICI();
		System.out.println("ICICI Interest Rate: " + b.getRate() + "%");
	}

}
