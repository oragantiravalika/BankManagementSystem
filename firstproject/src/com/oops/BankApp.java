package com.oops;

import java.util.Scanner;

//Base Class (Encapsulation)
class Account {
	private String name;
	private int accNumber;
	protected double balance;

	public Account(String name, int accNumber, double balance) {
		this.name = name;
		this.accNumber = accNumber;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Amount Deposited: " + amount);
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Account Number: " + accNumber);
		System.out.println("Balance: " + balance);
	}
}

//Inheritance
class SavingsAccount extends Account {

	public SavingsAccount(String name, int accNumber, double balance) {
		super(name, accNumber, balance);
	}

	// Polymorphism (Method Overriding)
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Insufficient Balance");
		}
	}
}

//Main Class
public class BankApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Account Number: ");
		int accNo = sc.nextInt();

		System.out.print("Enter Initial Balance: ");
		double balance = sc.nextDouble();

		SavingsAccount acc = new SavingsAccount(name, accNo, balance);

		int choice;
		do {
			System.out.println("\n--- MENU ---");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Display");
			System.out.println("4. Exit");

			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter amount: ");
				double dep = sc.nextDouble();
				acc.deposit(dep);
				break;

			case 2:
				System.out.print("Enter amount: ");
				double wd = sc.nextDouble();
				acc.withdraw(wd);
				break;

			case 3:
				acc.display();
				break;

			case 4:
				System.out.println("Thank You!");
				break;

			default:
				System.out.println("Invalid Choice");
			}

		} while (choice != 4);

		sc.close();
	}
}
