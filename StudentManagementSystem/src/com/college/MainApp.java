package com.college;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CollegeService college = new CollegeService();

		int choice;

		do {
			System.out.println("\n--- FEE MANAGEMENT SYSTEM ---");
			System.out.println("1. Add Student");
			System.out.println("2. Set Department");
			System.out.println("3. Set Fee");
			System.out.println("4. Pay Fee");
			System.out.println("5. Show Details");
			System.out.println("6. Exit");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Student ID: ");
				int id = sc.nextInt();

				System.out.print("Name: ");
				String name = sc.next();

				college.addStudent(new Student(id, name));
				break;

			case 2:
				System.out.print("Department: ");
				college.setDepartment(new Department(sc.next()));
				break;

			case 3:
				System.out.print("Total Fee: ");
				double fee = sc.nextDouble();

				college.setFee(new Fee(fee));
				break;

			case 4:
				System.out.print("Pay Amount: ");
				college.payFee(sc.nextDouble());
				break;

			case 5:
				college.showAll();
				break;

			case 6:
				System.out.println("Exit...");
				break;

			default:
				System.out.println("Invalid Choice!");
			}

		} while (choice != 6);

		sc.close();
	}
}