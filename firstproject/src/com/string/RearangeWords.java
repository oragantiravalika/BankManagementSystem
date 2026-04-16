package com.string;

public class RearangeWords {

	public static void main(String[] args) {
		String input = "going2 to3 school4 iam1";
		String[] words = input.split(" ");
		String[] result = new String[words.length];

		for (String word : words) {
			int len = word.length();
			char numChar = word.charAt(len - 1); 
			int index  = numChar - '1'; 

			result[index] = word.substring(0, len - 1); 
		}
		for (String word : result) {
			System.out.print(word + " ");
		}
	}
}

		
