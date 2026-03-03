package com.languagefundamentals;

public class Bank {
	String accountHolderName;
	long accountNumber;
	String password;
	double balance;
	void valuecreateAccount(String name, long accNo, String pwd, double bal) {
		accountHolderName = name;
		accountNumber = accNo;
		password = pwd;
		balance = bal;
		
	}
	double deposite(double amount) {
		balance = balance + amount;
		return balance;
	}
	
	double withdraw(double amount) {
		balance = balance - amount;
		return balance;
	
	}
	double balanceEnquiry() {
		return balance;
	}
	public static void main(String[] args) {
        Bank acc = new Bank();

        acc.valuecreateAccount("John", 123456789L, "pass123", 5000);

        acc.deposite(1000);
        acc.withdraw(2000);

       
         
        System.out.println("Account created successfully");
        System.out.println("Balance: " + acc.balanceEnquiry());
        System.out.println("Balance after deposite: " + acc.deposite(1000));
        System.out.println("Balance after withdraw: " + acc.withdraw(2000));
        System.out.println("Final balance: " + acc.balanceEnquiry());
        
	}
}

		

	