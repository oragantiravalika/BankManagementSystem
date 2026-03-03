package com.languagefundamentals;

import java.math.BigDecimal;

public class Marketing {
	static BigDecimal salary = new BigDecimal("10000");
	static BigDecimal travel = new BigDecimal("0.12");
	static BigDecimal internet = new BigDecimal("0.03");
    BigDecimal insurance = new BigDecimal("0.02");
	static BigDecimal c;

	static void show() {
		BigDecimal a = salary.multiply(travel);
		System.out.println("travel charges:" + a);
		BigDecimal b = salary.multiply(internet);
		System.out.println("internet:" + b);
		c = a.add(b).add(salary);
		System.out.println("salary:" + c);

	}

	void display() {
		BigDecimal d = insurance.multiply(salary);
		System.out.println("insurancededuction:" + d);
		BigDecimal e = c.subtract(d);
		System.out.println("final salary:" + e);

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Marketing m = new Marketing();
		show();
		m.display();

	}

}
