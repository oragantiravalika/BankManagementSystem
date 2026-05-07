package com.atm;
public class User {
    private String name;
    private int pin;
    private double balance;

    public User(String name, int pin, double balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }
}
