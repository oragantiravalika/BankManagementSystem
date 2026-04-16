package com.string;

class Thread2 extends Thread {
	public void run() {
		System.out.println("Hello Thread2");
	}
}

class test1 extends Thread {
	@Override
	public void run() {
		System.out.println("Hello Thread1");
	}
}

public class Thread1 {
	public static void main(String[] args) {
		test1 t1 = new test1();
		Thread2 t2 = new Thread2();

		t1.start();
		t2.start();
	}
}
