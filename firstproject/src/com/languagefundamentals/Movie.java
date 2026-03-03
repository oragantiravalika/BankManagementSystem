package com.languagefundamentals;

public class Movie {
	String MovieName;
	String Hero;
	String Heroine;
	long Budget;
	Movie(){
		this("Happy");
		System.out.println("no arg constructor");
	}
	Movie(String MovieName){
		this(MovieName,"Bunny");
	System.out.println("one arg constructor");
}
	Movie(String MovieName,String Hero){
		this(MovieName,Hero,"chinny");
		System.out.println("two arg constructor");
	}
Movie(String MovieName,String Hero, String Heroine){
	this(MovieName, Hero, Heroine,55000);
	System.out.println("three arg constructor");
}
Movie(String MovieName,String Hero, String Heroine,long Budget){
	this.MovieName = MovieName;
	this.Hero = Hero;
	this.Heroine = Heroine;
	this.Budget = Budget;
	System.out.println("four arg constructor");
}
 void display() {
	 System.out.println("Movie Name:"+MovieName);
	 System.out.println("Hero:"+Hero);
	 System.out.println("Heroine:"+Heroine);
	 System.out.println("Budget:"+Budget);
	 
 }
	public static void main(String[] args) {
      Movie m = new Movie();
      m.display();
	}

}
