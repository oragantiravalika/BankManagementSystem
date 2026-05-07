package com.collections;

import java.util.ArrayList;

public class CommonElementsExample {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(60);

		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(30);
		list3.add(20);
		list3.add(60);
		list3.add(80);

		ArrayList<Integer> commonList = new ArrayList<>(list1);

		// Find common elements
		commonList.retainAll(list2);
		commonList.retainAll(list3);

		if (commonList.isEmpty()) {
			System.out.println("No common elements found in all three lists");
		} else {
			System.out.println("Common elements in all three lists: " + commonList);
		}
	}
}