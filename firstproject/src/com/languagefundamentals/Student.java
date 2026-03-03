
package com.languagefundamentals;

public class Student {
	int id;
	String name;
	String branch;
	double marks;
	Student(int id, String name, String branch,double marks) {
		this.id= id;
	    this.name = name;
	    this.branch = branch;
	    this.marks = marks;
	}
    void displaydetails(){
    	System.out.println("main method started");
    	System.out.println("Student id :"+id);
    	System.out.println("Student name :"+ name);
    	System.out.println("Student branch :"+branch);
    	System.out.println("Student marks :"+ marks);
    	System.out.println("main method ended");
    }
	public static void main(String[] args) {
		Student s = new Student(101," darla", "cse", 500);
		s.displaydetails();

	}

}
