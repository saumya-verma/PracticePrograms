package com.more.practice;

public class StringCharacterCount {
	
	public static void main(String args[]) {
		
		String str= "He ll o";
		int count=0;
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)!=' ')
				count ++;
		}
		System.out.println(count);
	}

}
