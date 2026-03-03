package com.javaArrays;

import java.util.Random;
import java.util.Scanner;

public class Number {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rm = new Random();

		int randomnum = rm.nextInt(10) + 1; // 1 to 10 random number
		int chance = 3;
		int attempt = 0;

		System.out.println("Guess the number between 1 and 10");

		while (chance > 0) {

			System.out.println("Enter the guess number:");
			int input = sc.nextInt();
			attempt++;

			if (randomnum == input) {
				System.out.println("You won the match!");
				System.out.println("Attempts: " + attempt);
				break;
			} else if (input > randomnum) {
				System.out.println("Your number is high");
			} else {
				System.out.println("Your number is low");
			}

			chance--;

			if (chance == 0) {
				System.out.println("You lost the match!");
				System.out.println("Correct number was: " + randomnum);
			}
		}

		sc.close();
	}
}
