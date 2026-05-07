package com.collections;

import java.util.*;

public class FirstRepeat {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 4, 1, 5 };
		Set<Integer> set = new HashSet<>();
		for (int num : arr) {
			if (set.contains(num)) {
				System.out.println("first repeated:" + num);
				break;
			}
			set.add(num);
		}

	}
}
