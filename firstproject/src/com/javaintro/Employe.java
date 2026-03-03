package com.javaintro;

public class Employe {
	static int EmployeId;
	static String EmployeName;
	int Employecount;
	String Employecountry;

	public static void main(String[] args) {
		System.out.println("welcome to capgemini");
		Employe capgemini = new Employe();
		capgemini.Employecount = 800;
		capgemini.Employecountry = "india";
		EmployeId = 50627;
		EmployeName = "darla";
		System.out.println("Employe Id:" + EmployeId);
		System.out.println(" Emloye Name:" + EmployeName);
		System.out.println(" Employe count:" + capgemini.Employecount);
		System.out.println("Employe country:" + capgemini.Employecountry);
		System.out.println("welcome to infosys");
		Employe infosys = new Employe();
		System.out.println(" Employe Id:" + EmployeId);
		System.out.println(" Emloye Name:" + EmployeName);
		System.out.println(" Employe count:" + infosys.Employecount);
		System.out.println("Employe country:" + infosys.Employecountry);
		System.out.println("welcome to accenture");
		Employe accenture = new Employe();
		accenture.Employecount = 600;
		accenture.Employecountry = "europe";
		EmployeId = 10034;
		EmployeName = "alfa";

		System.out.println(" Employe Id:" + EmployeId);
		System.out.println(" Emloye Name:" + EmployeName);
		System.out.println(" Employe count:" + accenture.Employecount);
		System.out.println("Employe country:" + accenture.Employecountry);
		System.out.println("welcome to deloit");
		Employe deloit = new Employe();
		System.out.println(" Employe Id:" + EmployeId);
		System.out.println(" Emloye Name:" + EmployeName);
		System.out.println(" Employe count:" + deloit.Employecount);
		System.out.println("Employe country:" + deloit.Employecountry);

	}

}

