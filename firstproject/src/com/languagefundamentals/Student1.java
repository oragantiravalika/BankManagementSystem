package com.languagefundamentals;

public class Student1 {
	int Rollno;
	String Name;
	String Branch;
	Student1(int Rollno, String Name){
		System.out.println("Parameterized constructor of Student1");
		this.Rollno=Rollno;
		this.Name=Name;
	}
Student1(Student1 s, String Branch){
this.Rollno=s.Rollno;
this.Name=s.Name;
this.Branch=Branch;
}
void show() {
	System.out.println("Roll no:"+Rollno);
	System.out.println("Name:"+Name);
	System.out.println("Branch:"+Branch);
}
	public static void main(String[] args) {
     Student1 s1 = new Student1(505,"darla");
      s1.show();
      Student1 s2 = new Student1(s1,"cse");
      s2.show();
      
	}
}
