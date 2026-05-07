package com.Java8Features;

interface Square {
	int calculate(int x);
}

public class MultipleStatements {

	public static void main(String[] args) {
		Square s = (n) -> {
			return n * n;
		};
		System.out.println(s.calculate(6));
	}

}
