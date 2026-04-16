package com.multithreading;

class EvenThread implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("Even: " + i);
			}
		}
	}
}

class OddThread implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println("Odd: " + i);
			}
		}
	}
}

class Test1 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new EvenThread());
		Thread t2 = new Thread(new OddThread());

		t1.start();
		t2.start();
	}
}
