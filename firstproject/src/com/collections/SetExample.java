package com.collections;

import java.util.*;

public class SetExample {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 10, 30, 40, 20, 60 };

		Set<Integer> set = new LinkedHashSet<>();

		for (int num : arr) {
			set.add(num);
		}

		// Convert to list for output format
		List<Integer> result = new ArrayList<>(set);

		System.out.println(result);
	}
}