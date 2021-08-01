package com.practice.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String args[]) {

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(560, "Bob", 5000));
		employeeList.add(new Employee(430, "tom", 4000));
		employeeList.add(new Employee(850, "Harry", 8000));

		Collections.sort(employeeList);

		for (Employee e : employeeList) {
			System.out.println(e.empCode + " " + e.name + " " + e.salary);
		}

	}

}
