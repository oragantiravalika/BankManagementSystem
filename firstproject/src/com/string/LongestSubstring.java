package com.string;

import java.util.HashSet;

public class LongestSubstring {

	public static void main(String[] args) {

		String str = "abcabcbb";

		HashSet<Character> set = new HashSet<>();
		int left = 0, maxLength = 0;
		String result = "";

		for (int right = 0; right < str.length(); right++) {
			while (set.contains(str.charAt(right))) {
				set.remove(str.charAt(left));
				left++;
			}

			set.add(str.charAt(right));

			if (right - left + 1 > maxLength) {
				maxLength = right - left + 1;
				result = str.substring(left, right + 1);
			}
		}

		System.out.println(result);
	}
}
