package com.collections;

import java.util.*;

public class CommonElements {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 5));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

		set1.retainAll(set2); // keeps only common elements

		System.out.println("Common elements: " + set1);
	}
}