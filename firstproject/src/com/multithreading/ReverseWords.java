package com.multithreading;

public class ReverseWords {
	public static void main(String[] args) {
		String str = "I love Java";

		String[] words = str.split(" ");
		String result = "";

		for (int i = words.length - 1; i >= 0; i--) {
			result += words[i] + " ";
		}

		System.out.println(result.trim());
	}
}
