package com.javaintro;

public class Vehicle {
	static int vehicleId;
	static String vehicleName;

	int vehiclecount;
	String takenOutBy;

	public static void main(String[] args) {
		System.out.println("welcome to showroom");
		Vehicle Car = new Vehicle();
		Car.vehiclecount = 3;
		Car.takenOutBy = "darla";
		vehicleId = 1038;
		vehicleName = "Car";
		System.out.println("Car vehicleId: " + vehicleId);
		System.out.println("Car vehicleName:" + vehicleName);
		System.out.println("Car vehiclecount:" + Car.vehiclecount);
		System.out.println("Car takenOutBy:" + Car.takenOutBy);

	}

}
