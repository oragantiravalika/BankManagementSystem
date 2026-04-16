package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String:");
		String str1 = sc.nextLine();
		System.out.println("enter another String:");
		String str2 = sc.nextLine();

		char[] arrstr1 = str1.toCharArray();
		char[] arrstr2 = str2.toCharArray();
		Arrays.sort(arrstr1);
		Arrays.sort(arrstr2);

		boolean status = Arrays.equals(arrstr1, arrstr2);
		if (status) {
			System.out.println("The both strings are anagram");
		} else {
			System.out.println("The both strings are not a anagram");
		}
		sc.close();
	}
}
