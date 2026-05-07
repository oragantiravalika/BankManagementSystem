package com.Java8Features;

import java.util.*;

public class LambdaComparator {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Alice", "Bob");

		Collections.sort(names, (a, b) -> a.compareTo(b));

		System.out.println(names);
	}
}