package com.languagefundamentals;

 class Book {
	String BookName;
    int price;

    Book() {
        System.out.println("No-arg constructor of Book");
    }

    Book(String BookName, int price) {
    	System.out.println("Parameterized constructor from Book");
        this.BookName = BookName;
        this.price = price;
        
    }
    public static void main(String[] args) {
		System.out.println("Main method started from Book");
}
 }

class Author extends Book {
    String authorName;
    String authorPlace;

    Author() {
        
        System.out.println("No-arg constructor Author");
    }

    Author(String authorName, String authorPlace, String bookName, int price) {
        super(bookName, price);
        System.out.println("Parameterized constructor from Author");
        this.authorName = authorName;
        this.authorPlace = authorPlace;
        
    }

    public static void main(String[] args) {
		System.out.println("Main method started from author");
    }
    

    void display() {
        System.out.println("Book name   : " + BookName);
        System.out.println("Price       : " + price);
        System.out.println("Author name : " + authorName);
        System.out.println("Author place: " + authorPlace);
    }
}

 class Details {

	public static void main(String[] args) {
		System.out.println("Main method started from Author");
		Author a = new Author();
	a.display();
	 Author a1 = new Author("James Gosling", "USA", "Java", 2000);
     a1.display();
 }
}
	
	
		

        
        

       

 
	

