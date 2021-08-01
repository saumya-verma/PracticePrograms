package com.practice.programs;

import java.util.HashMap;
import java.util.Map;

public class MaxMinOccuringChar {

	public static void main(String args[]) {

		String str = "abcks ahaaaaadcbdls hilasd";
		str = str.replaceAll("\\s", "");
		System.out.println(str);
		char string[] = str.toCharArray();
		int n = string.length;
		System.out.println(n);
		int min, max;
		char maxChar = ' ';
		char minChar = ' ';
//		int counterArr[] = new int[n];
//		Arrays.fill(counterArr, 1);
		// Map<String, Integer> map = new TreeMap<>();

//		Boolean visited[] = new Boolean[n];
//		Arrays.fill(visited, false);
//
//		for (int i = 0; i < n; i++) {
//			// int count = 1;
//			if (visited[i] == true) {
//				continue;
//			}
//
//			for (int j = i + 1; j < n; j++) {
//				if (string[i] == string[j]) {
//					visited[j] = true;
//					// count++;
//					counterArr[i]++;
//				}
//			}
//
//		}
//
		min = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
//		
//		for (int i=0;i<counterArr.length;i++) {
//			if(counterArr[i]>max) {
//				max=counterArr[i];
//				maxChar=string[i];
//			}
//			
//			if(counterArr[i]<min ) {
//				min=counterArr[i];
//				minChar=string[i];
//			}
//		}
//		System.out.println("max occuring char "+maxChar+" Min occuring char "+minChar);
//

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			char ch = string[i];
			if (map.containsKey(ch)) {
				int freq = map.get(ch);
				map.put(ch, freq + 1);
			} else {
				map.put(ch, 1);
			}
		}

		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			 System.out.println(m.getKey()+" "+m.getValue());

			if (m.getValue() > max) {
				max = m.getValue();
				maxChar = m.getKey();
			}

			if (m.getValue() < min) {
				min = m.getValue();
				minChar = m.getKey();
			}
		}

		System.out.println("max occuring element: " + maxChar);
		System.out.println("min occuring element: " + minChar);

	}

}
