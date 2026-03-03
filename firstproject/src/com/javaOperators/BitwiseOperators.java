package com.javaOperators;

import java.util.Scanner;

public class BitwiseOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1.1 Declare two integer variables and read values from console
		System.out.print("Enter the first integer (a): ");
		int a = sc.nextInt();

		System.out.print("Enter the second integer (b): ");
		int b = sc.nextInt();

		// 1.2 Perform bitwise operations
		int andResult = a & b; // Bitwise AND
		int orResult = a | b; // Bitwise OR
		int xorResult = a ^ b; // Bitwise XOR
		int leftShiftA = a << 1; // Left shift a by 1
		int rightShiftB = b >> 1; // Right shift b by 1

		// 1.3 Display results with messages
		System.out.println("\nBitwise Operation Results:");
		System.out.println(a + " & " + b + " = " + andResult);
		System.out.println(a + " | " + b + " = " + orResult);
		System.out.println(a + " ^ " + b + " = " + xorResult);
		System.out.println(a + " << 1 = " + leftShiftA);
		System.out.println(b + " >> 1 = " + rightShiftB);

		sc.close();
	}
}

