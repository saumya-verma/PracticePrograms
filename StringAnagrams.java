package com.more.practice;

import java.util.Arrays;

public class StringAnagrams {

	public static void main(String[] args) {
		
		String str1 = "HEYA";
		String str2 ="YEhAh";
		
		char charArr1[] = str1.toLowerCase().toCharArray();
		char charArr2[]= str2.toLowerCase().toCharArray();
		
		if(str1.length()!=str2.length()) {
			System.out.println("Strings are not anagrams");
		}
		else {
			Arrays.sort(charArr1);
			Arrays.sort(charArr2);
			
			if(Arrays.equals(charArr1, charArr2)) {
				System.out.println("Anagrams");
				
			}else {
				System.out.println("Not anagrams");
			}
		}

	}

}
