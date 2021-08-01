package com.practice.programs;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapsPractice {
	
	public static void main(String args[]) {
		
		Map<Character,Integer> map = new HashMap<>();
		map.put('b',2);
		map.put('a',5);
		map.put('q',1);
		map.put('d',3);
		
//		System.out.println(map.size());
//		
//		for(Map.Entry<Character,Integer> m:map.entrySet()) {
//			System.out.println(m.getKey()+" "+m.getValue());
//		}
//		
//		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
//		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
//		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
		
		System.out.println(map);
		
		StringBuffer sb = new StringBuffer();
		
		for(Map.Entry<Character, Integer> m: map.entrySet()) {
			sb=sb.append(m.getKey());
			sb.append(" ");
		}
				
		String str = sb.toString();
		System.out.println(str);
	}

}
