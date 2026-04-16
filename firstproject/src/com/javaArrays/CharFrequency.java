package com.javaArrays;

public class CharFrequency {

	public static void main(String[] args) {
		        String str = "programming";
		        String checked = "";

		        for (int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);

		            // Skip if already counted
		            if (checked.indexOf(ch) != -1) {
		                continue;
		            }

		            int count = 0;

		            for (int j = 0; j < str.length(); j++) {
		                if (ch == str.charAt(j)) {
		                    count++;
		                }
		            }

		            System.out.println(ch + " - " + count);

		            // Mark this character as checked
		            checked += ch;
		        }
		    }
		}
	
