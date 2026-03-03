package com.oops;

public class Product {
	private int productId;
	private String productName;
	private double price;
	private int stockQuantity;

	// Constructor
	public Product(int productId, String productName, double price, int stockQuantity) {

		this.productId = productId;
		this.productName = productName;

		// Rule: Price must be > 0
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("Price must be greater than 0");
			this.price = 1; // default price
		}

		// Stock should not be negative
		if (stockQuantity >= 0) {
			this.stockQuantity = stockQuantity;
		} else {
			this.stockQuantity = 0;
		}
	}

	// Method to update stock
	public void updateStock(int quantity) {
		if (quantity > 0) {
			stockQuantity += quantity;
			System.out.println("Stock updated successfully.");
		} else {
			System.out.println("Invalid quantity to add.");
		}
	}

	// Method to sell product
	public void sellProduct(int quantity) {
		if (quantity <= 0) {
			System.out.println("Invalid quantity.");
		} else if (quantity > stockQuantity) {
			System.out.println("Not enough stock available.");
		} else {
			stockQuantity -= quantity;
			System.out.println("Product sold successfully.");
		}
	}

	// Method to get product details
	public void getProductDetails() {
		System.out.println("Product ID: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Price: " + price);
		System.out.println("Stock Quantity: " + stockQuantity);
		System.out.println("---------------------------");
	}

	public static void main(String[] args) {

		Product p1 = new Product(101, "Laptop", 50000, 10);

		p1.getProductDetails();

		p1.sellProduct(3); // selling 3 items
		p1.updateStock(5); // adding 5 items

		p1.getProductDetails();
	}
}
