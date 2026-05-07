package com.Java8Features;

import java.util.Arrays;
import java.util.List;

public class ListElements {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("darla", "jessy", "bobby");
		names.forEach(name -> System.out.println(name));

	}

}
