package com.collections;

import java.util.ArrayList;

public class UniqueElementsExample {
	public static void main(String[] args) {

		// First ArrayList
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);

		// Second ArrayList
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);

		// Create a new list (copy of list1)
		ArrayList<Integer> result = new ArrayList<>(list1);

		// Remove elements present in list2
		result.removeAll(list2);

		// Check result
		if (result.isEmpty()) {
			System.out.println("No unique elements found in the first list");
		} else {
			System.out.println("Unique elements in first list: " + result);
		}

		// Original lists remain unchanged
		System.out.println("Original List1: " + list1);
		System.out.println("Original List2: " + list2);
	}
}