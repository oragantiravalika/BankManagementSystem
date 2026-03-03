package com.javaintro;

public class Customer {
	int cid;
	String cname;
	protected void finalize() {
		System.out.println("finalize called!!");
		
	}

	public static void main(String[]args) {
Customer c1=new Customer();
Customer c2=new Customer();
Customer c3=new Customer();
// 1) Nullifying the object
c1=null;
c2=null;
c3=null;
//2) Re-assigning the objects
Customer c4= new Customer();
c1=c4;
// 3) objects inside the methods
//c1.welcome();

// 4) Anynomous object
new Customer();

System.gc();

System.out.println("c1:"+c1);
System.out.println("c2:"+c2);
System.out.println("c3:"+c3);


	}

}
