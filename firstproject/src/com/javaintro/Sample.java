package com.javaintro;

public class Sample {
	static int x = 100;
	int y;

	void display() {
		System.out.println("y:"+y);
		show();
		}
	static void show() {
		System.out.println("x:"+x);
}
	        public static void main(String[] args) {
	    		Sample s = new Sample();
	    		s.y=200;
	             s.display();
	             
	        }       	
}
		