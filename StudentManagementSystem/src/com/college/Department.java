package com.college;

public class Department {

	String deptName;

	public Department(String deptName) {
		this.deptName = deptName;
	}

	public void show() {
		System.out.println("Department: " + deptName);
	}
}