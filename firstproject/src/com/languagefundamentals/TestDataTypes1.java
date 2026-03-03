package com.languagefundamentals;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

class Dog {
}
public class TestDataTypes1 {
String name = "darla";
Integer il = 100;
Character ci = 'A';
Long MobileNo  = 7396657406L;
BigInteger bi = new BigInteger("234256765444455522111890032321877");
BigInteger bi1 = new BigInteger("443325627809365442678929025435689"); 
BigDecimal db = new BigDecimal("67.78");
BigDecimal db1 = new BigDecimal("73.69");
Dog d;



	public static void main(String[] args) {
    TestDataTypes1 t1 = new TestDataTypes1();
   
    System.out.println("name:"+t1.name);
    System.out.println("il :"+t1.il);
    System.out.println("ci :"+t1.ci);
    System.out.println("MobileNo :"+t1.MobileNo);
    System.out.println("bi :"+t1.bi);
    System.out.println("bi1 :"+t1.bi1);
    
    System.out.println("**********Integer Operations********");
    
    System.out.println("BigInteger Addition:"+t1.bi.add(t1.bi1));
    System.out.println("BigInteger subtraction:"+t1.bi.subtract(t1.bi1));
    System.out.println("BigInteger multiplication:"+t1.bi.multiply(t1.bi1));
    System.out.println("BigInteger division:"+t1.bi.divide(t1.bi1));
    System.out.println("BigInteger modulus:"+t1.bi.mod(t1.bi1));
    
    System.out.println("**********Decimal Operations********");
    
    System.out.println("BigDecimal addition:"+t1.db.add(t1.db1));
    System.out.println("BigDecimal subtraction:"+t1.db.subtract(t1.db1));
    System.out.println("BigDecimal multiplication:"+t1.db.multiply(t1.db1));
    System.out.println("BigDecimal division:"+t1.db.divide(t1.db1,2,RoundingMode.HALF_UP));
    System.out.println("BigDecimal modulus :"+t1.db.remainder(t1.db1));
    System.out.println("t1.d");
   
    
    
	}

}
