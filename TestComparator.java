package com.practice.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

	public static void main(String args[]) {

		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(3, "bob", 30));
		studentList.add(new Student(1, "James", 20));
		studentList.add(new Student(5, "Larry", 40));

		// Collections.sort(studentList, new StudentRollNoComparator());

//		for (Student s : studentList) {
		// System.out.println(s.rollno + " " + s.name + " " + s.age);
		// }

		Comparator<Student> c1 = Comparator.comparing(Student::getRollno);
		Collections.sort(studentList, c1);

		for (Student s : studentList) {
			System.out.println(s.rollno + " " + s.name + " " + s.age);
		}
	}

}
//  Comparator<Student> c2=Comparator.comparing(Student::getName,
//  Comparator.nullsFirst(String::compareTo));-- if any name is null