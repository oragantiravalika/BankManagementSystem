package com.javaOperators;

public class Operators1 {
	
	//4) Unary Operators  + - ++ --
	

		public static void main(String[] args) {
			System.out.println("main method started !!");

			int a = 5;
			int b = 6;
			boolean flag = false;
			char c = 'R';
			double d = 12.56;
			String s = "darla";
			
			System.out.println("char:"+c);
			System.out.println("boolean:"+true);
			System.out.println("double:"+d);
			System.out.println("String:"+s);

			System.out.println(-a);// Unary minus --> -5
			System.out.println(+b);// unary plus --> 6

			System.out.println("******************");
			System.out.println(a++);// 5 --> 6 : a++ --> a = a+1
			System.out.println(++a);// 7 a = a+1
			System.out.println(++a);// 8
			System.out.println(a++);// 8 --> 9

			System.out.println("**************");
			System.out.println(++b);// 7
			System.out.println(++b);// 8
			System.out.println(b++);// 8 --> 9
			System.out.println("B value : " + b);
	
			System.out.println(a--);// 9--> 8 a-- : a= a-1
			System.out.println(--a);
			System.out.println(--a);
			System.out.println(--b);// 8
			System.out.println(b--);// 8 --> 7
			System.out.println(--b);// 6
			System.out.println("A value : " + a);// 6
			System.out.println("B value : " + b);// 6

			System.out.println(a++ + b++ + a-- + b--);

			System.out.println(a);
			System.out.println(b);

			System.out.println(++a + ++a + b++ + a++ + b++ + a++);

			//7 + 8 + 6 + 8 + 7 + 9 
			System.out.println(++a + ++a + b++ + a++ + b++ + a++);//
	}

}
