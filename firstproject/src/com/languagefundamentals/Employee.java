package com.languagefundamentals;

import java.math.BigDecimal;
//import java.math.BigInteger;

public class Employee {
	BigDecimal salary = new BigDecimal("5000");
	BigDecimal DAPerc = new BigDecimal("8");
	BigDecimal Pf = new BigDecimal("3");
	BigDecimal cgst =new BigDecimal("7");
	
	
	BigDecimal NetSalary;
	
	
	
	//BigInteger AnualSalary;
	{
		BigDecimal percent =new BigDecimal("100");
		
		NetSalary =salary.add(salary.multiply(DAPerc.divide(percent)));
		System.out.println("adding da:"+NetSalary);
		
		NetSalary = NetSalary.subtract(salary.multiply(Pf.divide(percent)));
		System.out.println("subract pf:"+NetSalary);
		NetSalary = NetSalary.subtract(salary.multiply(cgst.divide(percent)));
		System.out.println("subtract cgst:"+NetSalary);
		
		System.out.println("Netsalary:"+NetSalary);
		System.out.println("annual salary:"+NetSalary.multiply(BigDecimal.valueOf(12)));
		
	}
	
	

	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		
		
		

	}

}