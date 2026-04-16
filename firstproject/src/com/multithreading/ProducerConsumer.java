package com.multithreading;

class Resource {
	int i = 0;
	boolean status = false;

	synchronized void put(int i) throws InterruptedException {
		while (status) {
			wait();
		}
		this.i = i;
		System.out.println("Put: " + i);
		status = true;
		notify();
	}

	synchronized void get() throws InterruptedException {
		while (!status) {
			wait();
		}
		System.out.println("Get: " + i);
		status = false;
		notify();
	}
}

// Producer class
class Producer implements Runnable {
	Resource r;

	Producer(Resource r) {
		this.r = r;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	public void run() {
		int i = 0;
		try {
			while (true) {
				r.put(i++);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

// Consumer class
class Consumer implements Runnable {
	Resource r;

	Consumer(Resource r) {
		this.r = r;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	public void run() {
		try {
			while (true) {
				r.get();
				Thread.sleep(500);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

// Main class
public class ProducerConsumer {
	public static void main(String[] args) {
		Resource r = new Resource();
		Producer p = new Producer(r);
		Consumer c = new Consumer(r);
	}
}
