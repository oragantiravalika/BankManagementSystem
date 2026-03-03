package com.languagefundamentals;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class StationaryCompany {
	BigDecimal rawmaterial = new BigDecimal("18000");
	BigDecimal labourcost = new BigDecimal("12000");
	BigDecimal factoryoverhead = new BigDecimal("6000");
	BigDecimal wastageofmaterial = new BigDecimal("5");
	BigDecimal scrap = new BigDecimal("2");
	BigDecimal packing = new BigDecimal("3000");
	BigDecimal transport = new BigDecimal("4000");
	BigDecimal Noofpens = new BigDecimal("2000");
	
	{
	
		BigDecimal percent = new BigDecimal ("100");
		BigDecimal w =rawmaterial.multiply(wastageofmaterial.divide(percent));		
		System.out.println("after removing wastage material:"+w);
		BigDecimal b = w.subtract(rawmaterial.multiply(scrap.divide(percent)));
		System.out.println("after scraping:"+b);
		BigDecimal c = packing.add(b).add(b).add(rawmaterial).add(labourcost).add(factoryoverhead);
		System.out.println("total amount:"+c);
		BigDecimal d =c.divide(Noofpens,2,RoundingMode.HALF_UP);
		System.out.println("cost of pen:"+d);
		
		
	}
	
	public static void main(String[] args) {
		StationaryCompany s1 = new StationaryCompany();		

	}

}
