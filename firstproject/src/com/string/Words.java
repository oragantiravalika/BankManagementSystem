package com.string;

public class Words {

	public static void main(String[] args) {
		String s = "JAVA IS SIMPLE WHEN YOU PRACTICEs";
		String[] words = s.split(" ");
		for (String word : words) {
			char ch = word.charAt(0);

			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' ||
					ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u') {

				System.out.print(word + " ");
			}

		}
	}
}
