package com.abstractinterface;

//Interface
interface Vehicle {

	// Abstract method (by default public & abstract)
	void start();
}

//Child class 1
class Car implements Vehicle {

	// Implementing method
	public void start() {
		System.out.println("Car starts with key");
	}
}

//Child class 2
class Bike implements Vehicle {

	// Implementing method
	public void start() {
		System.out.println("Bike starts with kick");
	}
}

//Main class
class Main3 {
	public static void main(String[] args) {

		// Using interface reference
		Vehicle v1 = new Car();
		Vehicle v2 = new Bike();

		// Calling methods
		v1.start();
		v2.start();
	}
}
