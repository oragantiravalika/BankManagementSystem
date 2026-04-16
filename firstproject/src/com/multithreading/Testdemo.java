package com.multithreading;

class Numberprint extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i <= 10; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread Interrupted");
		}
	}
}

public class Testdemo {

	public static void main(String[] args) {
		Numberprint n = new Numberprint();
		n.start();
	}

}
