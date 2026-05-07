package com.Java8Features;
	interface Hello {
		void sayHello();
	}

	public class LambdaExpressions {
		public static void main(String[] args) {
			Hello h = () -> System.out.println("Hello World!");
			h.sayHello();
		}
	}

