package com.multithreading;

class twotable extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("2 * " + i + " = " + (2 * i));
		}
	}
}

class threetable extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("3 * " + i + " = " + (3 * i));
		}
	}
}

class fivetable extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("5 * " + i + " = " + (5 * i));
		}
	}
}

public class TableThread extends Thread {
	public static void main(String[] args) {
		
	twotable t1 = new twotable();
		threetable t2 = new threetable();
		fivetable t3 = new fivetable();
	try {
            t1.start();
            t1.join();   

             t2.start();
             t2.join();   

             t3.start();
             t3.join();   

      } catch (InterruptedException e) {
           e.printStackTrace();
        }
   }
}
		
