package com.languagefundamentals;

import java.util.Scanner;

public class StudentsResults {

	int English, Telugu, Hindi, Maths, Science, Social;
	
	void calculateresults(int eng, int tel, int hin, int mat, int sci, int soc) {
		English = eng;
		Telugu = tel;
		Hindi = hin;
		Maths = mat;
		Science = sci;
		Social = soc;
		int total = (eng + tel + hin + mat + sci + soc);
		double average = total / 6.0;
		System.out.println("****student marks details****");
		System.out.println("English:" + eng);
		System.out.println("Telugu:" + tel);
		System.out.println("Hindi:" + hin);
		System.out.println("Maths:" + mat);
		System.out.println("Science:" + sci);
		System.out.println("Social:" + soc);
		System.out.println("totalmarks:" + total);
		System.out.println("average:" + average);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter English marks");
		int eng = sc.nextInt();

		System.out.println("enter Telugu marks");
		int tel = sc.nextInt();

		System.out.println("enter Hindi marks");
		int hin = sc.nextInt();

		System.out.println("enter Maths marks");
		int mat = sc.nextInt();

		System.out.println("enter Science marks");
		int sci = sc.nextInt();

		System.out.println("enter Social marks");
		int soc = sc.nextInt();

		StudentsResults student = new StudentsResults();
		student.calculateresults(eng, tel, hin, mat, sci, soc);
		sc.close();

	}

}
