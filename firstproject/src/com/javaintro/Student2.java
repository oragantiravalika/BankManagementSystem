package com.javaintro;

public class Student2 {
	int rollno;
	String name;
	float marks;
	static boolean ispassed = true;
	void display(){
		System.out.println("rollno:"+rollno);
    System.out.println("name:"+name);
    System.out.println("marks:"+marks);
    System.out.println("ispassed:"+ispassed);
	}
	public static void main(String[] args) {
     Student2 s = new Student2();		
      s.rollno = 505;
      s.name = "darla";
      s.marks = 100;
      System.out.println("rollno:"+s.rollno);
      System.out.println("name:"+s.name);
      System.out.println("marks:"+s.marks);
      System.out.println("ispassed:"+ispassed);
     s. display();
      
      
      Student2 s1 = new Student2();	
      s1.rollno = 506;
      s1.name = "chinni";
      s1.marks = 50;
       s1.display();
      
      
      Student2 s2 = new Student2();	
      s2.rollno = 507;
      s2.name = "bala";
      s2.marks = 300;
      System.out.println("rollno:"+s2.rollno);
      System.out.println("name:"+s2.name);
      System.out.println("marks:"+s2.marks);
      System.out.println("ispassed:"+ispassed);
      s2.display();
      
      Student2 s3 = new Student2();	
      s3.rollno = 508;
      s3.name = "jessy";
      s3.marks = 400;
      System.out.println("rollno:"+s3.rollno);
      System.out.println("name:"+s3.name);
      System.out.println("marks:"+s3.marks);
      System.out.println("ispassed:"+ispassed);
      s3.display();
	}
}


