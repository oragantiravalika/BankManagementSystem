package com.collections;

import java.util.HashSet;
import java.util.Set;

public class CourseEnrollment {

	public static void main(String[] args) {
// CSE Courses
		Set<String> cseCourses = new HashSet<>();
		cseCourses.add("java");
		cseCourses.add("python");
		cseCourses.add("DBMS");
		cseCourses.add("Data Structures");

// ECE Courses
		Set<String> eceCourses = new HashSet<>();
		eceCourses.add("Python");
		eceCourses.add("DBMS");
		eceCourses.add("Embedded Systems");
		eceCourses.add("Digital Electronics");
//Common Courses
		Set<String> commonCourses = new HashSet<>(cseCourses);
		commonCourses.retainAll(eceCourses);

//Courses only in CSE
		Set<String> onlyCSE = new HashSet<>(cseCourses);
		onlyCSE.removeAll(eceCourses);

//Courses only in ECE
		Set<String> onlyECE = new HashSet<>(eceCourses);
		onlyECE.removeAll(cseCourses);

		System.out.println("CSE Courses: " + cseCourses);
		System.out.println("ECE Courses: " + eceCourses);

		System.out.println("\nCommon Courses: " + commonCourses);
		System.out.println("Courses only in CSE: " + onlyCSE);
		System.out.println("Courses only in ECE: " + onlyECE);
	}

}
