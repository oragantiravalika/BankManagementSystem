package com.javaArrays;

public class Prime_and_reverseOf_Numberis_Prime {

	//public static void main(String[] args) {
		
		    private static boolean isprime(int n) {
		        boolean status = true;

		        if (n <= 1) {
		            status = false;
		        }

		        for (int i = 2; i <= n / 2; i++) {
		            if (n % i == 0) {
		                status = false;
		                break;
		            }
		        }

		        return status;
		    }

		    public static void main(String[] args) {

		        int[] arr = {12, 13, 34, 54, 61, 21};

		        System.out.println("Main method started...");

		        for (int i = 0; i < arr.length; i++) {

		            int temp = 0;
		            int num = arr[i];

		            if (isprime(num)) {

		                while (num != 0) {
		                    int rem = num % 10;
		                    num = num / 10;
		                    temp = temp * 10 + rem;
		                }

		                if (isprime(temp)) {
		                    System.out.println(arr[i] + " is prime and reverse of number " 
		                            + temp + " is also prime");
		                }
		            }
		        }

		        System.out.println("<<--- Main Method Ended --->>");
		    }
		}
	
