package com.multithreading;

class MyThread implements Runnable {
	public void run() {
		System.out.println("Running Thread:"+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		MyThread obj = new MyThread();

		Thread t1 = new Thread(obj,"0");
		Thread t2 = new Thread(obj,"1");
		Thread t3 = new Thread(obj,"2");
		Thread t4 = new Thread(obj,"3");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
