package com.Java8Features;

import java.util.*;

public class WordFrequency {
	public static void main(String[] args) {
		String sentence = "Java is easy and Java is powerful";

		// Convert to lowercase and split words
		String[] words = sentence.toLowerCase().split("\\s+");

		HashMap<String, Integer> map = new HashMap<>();

		for (String word : words) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}

		// Print frequencies
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}