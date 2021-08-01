package com.practice.programs;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapComparingByValueReverse {
	
	public static void main(String args[]) {
		
		HashMap<Integer,String> h = new HashMap<>();
		h.put(1, "Pam");
		h.put(3,"Zam");
		h.put(2,"Dam");
		
	//	for(Map.Entry m: h.entrySet()) {
	//		System.out.println(m.getKey()+" "+m.getValue() );
	//	}
		
		h.entrySet().stream().sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);
		
		
		h.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.forEach(System.out::println);
		
	}

}


