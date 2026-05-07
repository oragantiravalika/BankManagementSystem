package com.atm;
public interface ATMInterface {
	void checkBalance();
	void deposit(double amount);
	void withdraw(double amount);
	void PinChange(int oldPin, int newPin);
}
