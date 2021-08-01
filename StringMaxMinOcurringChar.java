package com.more.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMaxMinOcurringChar {

	public static void main(String args[]) {
		String str = "abcdaabb";
		str = str.replaceAll("\\s", "");
		// System.out.println(str);
		char string[] = str.toCharArray();

		int counterArr[] = new int[string.length];
		Arrays.fill(counterArr, 1);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		char minChar = ' ';
		char maxChar = ' ';

//		Map<Character,Integer> map= new HashMap<>();
//		
//		for(int i=0;i<str.length();i++) {
//			   char ch= str.charAt(i);
//			if(map.containsKey(ch)) {
//				int freq = map.get(ch);
//				map.put(ch, freq+1);
//			}else {
//				map.put(ch,1);
//			}
//		}
//		
//		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
//			System.out.println(entry.getKey()+" "+entry.getValue());
//			
//			if(entry.getValue()<min) {
//				min=entry.getValue();
//				minChar=entry.getKey();
//			}
//			
//			if(entry.getValue()>max) {
//				max=entry.getValue();
//				maxChar=entry.getKey();
//			}
//		}
//		
//		System.out.println("Max Ouccring char:"+ maxChar+" "+ max);
//		System.out.println("Min Ouccring char:"+ minChar+" "+ min);	

		Boolean visited[] = new Boolean[string.length];
		Arrays.fill(visited, false);

		for (int i = 0; i < string.length; i++) {
			if (visited[i] == true) {
				continue;
			}
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j]) {
					counterArr[i]++;
					visited[j] = true;
				}

			}

			System.out.println(counterArr[i] + " " + string[i]);

		}

		for (int i = 0; i < counterArr.length; i++) {
			if (counterArr[i] < min) {
				min = counterArr[i];
				minChar = string[i];
			}

			if (counterArr[i] > max) {
				max = counterArr[i];
				maxChar = string[i];
			}
		}

		System.out.println("maxChar" + " " + maxChar);
		System.out.println("minChar" + " " + minChar);

	}

}
