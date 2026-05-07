package com.collections;

import java.util.*;

public class HashSetRemove {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.remove(20);
		System.out.println("Remaning elements:" + set);
	}

}
