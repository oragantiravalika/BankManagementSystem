package com.javaintro;

public class Bank {
	static  int account_number=12031;
    String account_name;
    Double balance;
    public void display() {
    	System.out.println("account_number:"+account_number);
    	System.out.println("account_name:"+account_name);
    	System.out.println("balance:"+balance);
    	account_number++;	
    }
    public static void main(String[] args) {
	Bank b = new Bank();
	b.account_name = "Ravalika";
	b.balance = 20000d;
	Bank b1 = new Bank();
	b1.account_name = "Darla";
	b1.balance = 10000d;
	b.display();
	b1.display();
}
	
	}


