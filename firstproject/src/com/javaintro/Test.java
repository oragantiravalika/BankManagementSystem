package com.javaintro;
class student1 {
	student1 s;
	protected void finalize()throws Throwable{
		System.out.println("finalize called");
		
	}
}

public class Test {

	public static void main(String[] args) {
student1 s1=new student1();
student1 s2=new student1();
s1.s=s2;
s2.s=s1;

s1=null;
s2=null;
System.gc();
	}

}
