package com.more.practice;

public class StringAddNosInString {
	
	public static void main(String args[]) {
		
		String str="adcnk12s7ab1bjjj1d100";
		String temp="0";
		int sum =0;
		for(int i=0;i<str.length();i++) {
			char check=str.charAt(i);
			if(Character.isDigit(check)) {
				temp+=check;
			}else {
				sum+=Integer.parseInt(temp);
				temp="0";
			}
		}
		
		sum+=Integer.parseInt(temp);
		System.out.println("Sum of digits="+sum);
		
	}

}
