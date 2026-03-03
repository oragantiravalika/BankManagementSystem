package com.javaArrays;

class Dog {
	public void sound(int x) {
		System.out.println("Dog barks" + x + "times");
	}
}

public class Main {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.sound(20);
	}

}
