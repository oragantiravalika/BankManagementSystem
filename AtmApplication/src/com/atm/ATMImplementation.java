package com.atm;

public class ATMImplementation implements ATMInterface {

	private User user;

	public ATMImplementation(User user) {
		this.user = user;
	}

	@Override
	public void checkBalance() {
		try {
			System.out.println("Fetching balance...");
			Thread.sleep(1500);
		} catch (InterruptedException e) {
		}

		System.out.println("Balance: " + user.getBalance());
	}

	@Override
	public void deposit(double amount) {
		try {
			System.out.println("Processing deposit...");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}

		user.setBalance(user.getBalance() + amount);
		System.out.println("Deposit successful!");
		System.out.println("Updated Balance: " + user.getBalance());
	}

	@Override
	public void withdraw(double amount) {
		try {
			System.out.println("Processing withdrawal...");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}

		if (amount <= user.getBalance()) {
			user.setBalance(user.getBalance() - amount);
			System.out.println("Withdraw successful!");
			System.out.println("Remaining Balance: " + user.getBalance());
		} else {
			System.out.println("Insufficient balance!");
		}
	}

	@Override
	public void PinChange(int oldPin, int newPin) {
		if (user.getPin() == oldPin) {

			try {
				System.out.println("Updating PIN...");
				Thread.sleep(1500);
			} catch (InterruptedException e) {
			}

			user.setPin(newPin);
			System.out.println("PIN changed successfully!");
		} else {
			System.out.println("Incorrect old PIN!");
		}
	}
}