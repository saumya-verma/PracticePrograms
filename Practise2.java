package com.more.practice;

import java.util.ArrayList;
import java.util.List;

public class Practise2 {
	
	public static void main(String args[]) {
		
		List<String> strings = new ArrayList<>();
		
		strings.add("Saumya");
		strings.add("Vansh");
		strings.add("Raj");
	
		for(int i=0;i<strings.size();i++) {
			
			if(strings.get(i).charAt(0)=='S') {
				strings.set(i,"Verma");
			}else if(strings.get(i).charAt(0)=='V') {
				strings.remove(i);
			}
			
		}
		
		for(String s: strings) {
			System.out.println(s);
		}
	
		
	}
}
