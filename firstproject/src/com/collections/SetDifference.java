package com.collections;

import java.util.HashSet;

public class SetDifference {

	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);

		set2.add(30);
		set2.add(40);
		set2.add(50);
		set2.add(10);
		set1.removeAll(set2);
		System.out.println("Elements in set1:" + set1);

	}

}
