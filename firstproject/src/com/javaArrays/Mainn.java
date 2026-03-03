package com.javaArrays;

class Employee {

	private String name;
	private int salary;

	// Constructor
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	// Getter method
	public void getSalary() {
		System.out.println("Salary: " + salary);
	}

	// Setter method
	public void setSalary(int salary) {
		if (salary > 0) {
			this.salary = salary;
		} else {
			System.out.println("Invalid salary");
		}
	}
}

public class Mainn {

	public static void main(String[] args) {
		Employee emp = new Employee("John", 50000);

		emp.getSalary(); // 50000

		emp.setSalary(60000); // Update salary
		emp.getSalary(); // 60000

		emp.setSalary(-1000); // Invalid salary
	}
}
