package com.logicalstatements;

import java.util.Scanner;

public class Logical13 {

	public static void main(String[] args) {
System.out.println("main method started");
Scanner sc = new Scanner(System.in);
System.out.println(Math.pow(2, 3));
System.out.println("please enter s number: ");

int n = sc.nextInt();// 153
//int n1 = n;
int temp = n;
int r = 0;
int sumP = 0;
int count = 0;

String s = Integer.toString(n);//153
int digitCount = s.length();


//while (n != 0) {
//	n = n / 10;
//	count++;
//}

while (n != 0) { // 153!=0
	r = n % 10;// 153%10 = 3,15%10=5, 1%10=1
	n = n / 10;// 15/10=15,15/10=1,1/0=0
//	sumP = sumP + r * r * r;// 27 + 125 + 1 = 153

	sumP = (int) (sumP + Math.pow(r, digitCount));
}

if (sumP == temp) {
	System.out.println("The Given Number is Armstrong ");
} else {
	System.out.println("The Given Number is not Armstrong ");
}

}
	}


