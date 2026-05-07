package com.college;

public class Fee {

	double totalFee;
	double paidFee;

	public Fee(double totalFee) {
		this.totalFee = totalFee;
		this.paidFee = 0;
	}

	public void payFee(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid Amount!");
			return;
		}

		if (paidFee + amount > totalFee) {
			System.out.println("Fee exceeds total amount!");
			return;
		}

		paidFee += amount;
		System.out.println("Fee Paid: " + amount);
	}

	public double getDue() {
		return totalFee - paidFee;
	}

	public void showFee() {
		System.out.println("Total Fee: " + totalFee);
		System.out.println("Paid Fee: " + paidFee);
		System.out.println("Due Fee: " + getDue());
	}
}