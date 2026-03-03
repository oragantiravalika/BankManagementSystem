package com.javaArrays;

public class Student {

	// Static variables
	static String collegeName;
	static int idCounter;
	static int totalStudents = 0;

	// Instance variables
	int studentId;
	String studentName;
	String studentCourse;

	// Static block
	static {
		collegeName = "ABC Engineering College";
		idCounter = 1000;
		System.out.println("College initialized");
	}

	// Instance block
	{
		studentId = ++idCounter;
		totalStudents++;
	}

	// Constructor

	Student(String name, String course) {
		this.studentName = name;
		this.studentCourse = course;
	}

	// Instance method
	void displayDetails() {
		System.out.println("New student object created:");
		System.out.println("College Name: " + collegeName);
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Name: " + studentName);
		System.out.println("Course: " + studentCourse);
		System.out.println("-------------------------");
	}

	// Static Method
	static void displayTotalStudents() {
		System.out.println("Total Students: " + totalStudents);

	}

	// Main Method
	public static void main(String[] args) {

		Student s1 = new Student("Darla", "CSE");
		Student s2 = new Student("Jessy", "ECE");
		Student s3 = new Student("Jinnu", "IT");

		s1.displayDetails();
		s2.displayDetails();
		s3.displayDetails();

		Student.displayTotalStudents();
	}
}
