package com.college;

public class CollegeService {

	Student student;
	Fee fee;
	Department dept;

	// add student
	public void addStudent(Student s) {
		student = s;
	}

	// set fee
	public void setFee(Fee f) {
		fee = f;
	}

	// set department
	public void setDepartment(Department d) {
		dept = d;
	}

	// pay fee
	public void payFee(double amount) {
		if (fee != null) {
			fee.payFee(amount);
		} else {
			System.out.println("Fee not set!");
		}
	}

	// show details
	public void showAll() {

		if (dept != null)
			dept.show();

		if (student != null)
			student.display();

		if (fee != null)
			fee.showFee();
	}
}