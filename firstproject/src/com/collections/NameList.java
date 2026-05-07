package com.collections;

import java.util.ArrayList;

public class NameList {

	public static void main(String[] args) {
		ArrayList<String> c = new ArrayList<>();
		// Add Elements
		c.add("ram");
		c.add("sita");
		c.add("jessy");
		c.add("darla");
		c.add("bunny");
		for (String name : c) {
			System.out.println(name);
		}
	}
}
