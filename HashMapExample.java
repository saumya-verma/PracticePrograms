package com.practice.programs;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	
	public static void main(String args[]) {
		
		HashMap<Integer,Employee> empMap = new HashMap<>();
		empMap.put(1, new Employee(10, "Sam", 500));
		empMap.put(2, new Employee(40, "Ram", 600));
		empMap.put(3, new Employee(20, "Mam", 300));
		
		for(Map.Entry<Integer,Employee> m: empMap.entrySet()){
			
			Integer i = m.getKey();
			Employee e=m.getValue();
			System.out.println(i);
			System.out.println(e.empCode+" "+e.name+" "+e.salary);
		}
	}

}
