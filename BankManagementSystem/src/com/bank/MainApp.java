package com.bank;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();

		int choice;

		do {
			System.out.println("\n--- BANK MENU ---");
			System.out.println("1. Create Customer");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Show Customer");
			System.out.println("5. Last Transaction");
			System.out.println("6. Exit");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Name: ");
				String name = sc.next();

				System.out.print("Age: ");
				int age = sc.nextInt();

				System.out.print("Acc No: ");
				String accNo = sc.next();

				System.out.print("Balance: ");
				double bal = sc.nextDouble();

				bank.createCustomer(name, age, accNo, bal);
				break;

			case 2:
				System.out.print("Amount: ");
				bank.deposit(sc.nextDouble());
				break;

			case 3:
				System.out.print("Amount: ");
				bank.withdraw(sc.nextDouble());
				break;

			case 4:
				bank.showCustomer();
				break;

			case 5:
				bank.showLastTransaction();
				break;

			case 6:
				System.out.println("Exit...");
				break;

			default:
				System.out.println("Invalid Choice!");
			}

		} while (choice != 6);

		sc.close();
	}
}
