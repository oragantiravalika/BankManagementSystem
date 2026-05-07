package com.Java8Features;

import java.util.*;

public class CharacterFrequency {
	public static void main(String[] args) {
		String str = "programming";

		HashMap<Character, Integer> map = new HashMap<>();

		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		// Print only repeated characters
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	}
}
