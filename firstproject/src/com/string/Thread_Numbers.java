package com.string;

public class Thread_Numbers extends Thread {
	@Override

	public void run() {
		System.out.println("thread created");

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Thread_Numbers tn = new Thread_Numbers();
		for (int i = 0; i < 30; i++) {
			System.out.println("Thread Numbers:" + i);
		}
		tn.start();
	}
}
