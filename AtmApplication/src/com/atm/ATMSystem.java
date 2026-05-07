package com.atm;
import java.util.Scanner;
public class ATMSystem {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Multiple users using array
		User[] users = { new User("darla", 8896, 20000), new User("bunnu", 9986, 10000) };
        System.out.print("Enter PIN: ");
		int enteredPin = sc.nextInt();
        User currentUser = null;
        // Find user
		for (User u : users) {
			if (u.getPin() == enteredPin) {
				currentUser = u;
				break;
			}
		}
           if (currentUser == null) {
			System.out.println("Invalid PIN!");
			return;
		}
        ATMInterface atm = new ATMImplementation(currentUser);
		System.out.println("Welcome " + currentUser.getName());

		int choice;

		do {
			try {
				System.out.println("\nLoading menu...");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
		}
			System.out.println("\n--- ATM MENU ---");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Change PIN");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				atm.checkBalance();
				break;
			case 2:
				System.out.print("Enter amount: ");
				atm.deposit(sc.nextDouble());
				break;
			case 3:
				System.out.print("Enter amount: ");
				atm.withdraw(sc.nextDouble());
				break;
			case 4:
				System.out.print("Enter old PIN: ");
				int oldPin = sc.nextInt();
				System.out.print("Enter new PIN: ");
				int newPin = sc.nextInt();
				atm.PinChange(oldPin, newPin);
				break;
			case 5:
				try {
					System.out.println("Closing session...");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.println("Thank you for using Union Bank ATM services!!");
				break;
			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 5);

		sc.close();
	}
}