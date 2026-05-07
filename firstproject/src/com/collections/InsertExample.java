package com.collections;

import java.util.ArrayList;
import java.util.List;

public class InsertExample {
	public static void main(String[] args) {
		List<String> List = new ArrayList<>();
		List.add("Python");
		List.add("c");
		List.add("c++");
		List.add("Python");
		System.out.println(List);
		for (int i = 0; i < List.size(); i++) {
			if (List.get(i).equals("Python")) {
				List.add(i + 1, "java");
			}

		}
		System.out.println(List);
	}
}
