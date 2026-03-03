package com.javaArrays;

public class Stockmarket {

	public static void main(String[] args) {

		int arr[] = { 10, 9, 1, 2, 27, 3, 7 };
		int maxprofit = 0;
		int buyprice = 0;
		int sellprice = 0;

		for (int i = 0; i < arr.length; i++) {
			int buyday = arr[i];

			for (int j = i + 1; j < arr.length; j++) {
				int sellday = arr[j];
				int profit = sellday - buyday;

				if (profit > maxprofit) {
					maxprofit = profit;
					buyprice = arr[i];
					sellprice = arr[j];
				}
			}
		}

		System.out.println("Buy Price:" + buyprice);
		System.out.println("Sell Price:" + sellprice);
		System.out.println("Maximum Profit: " + maxprofit);
	}
}