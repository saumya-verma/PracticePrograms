package com.more.practice;

public class StringLargestSmallestWord {
	
	public static void main(String args[]) {
		String str="Hello hi who are you";
		
		String strArr[]=str.split(" ");
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		String minWord="";
		String maxWord="";
		for(int i=0;i<strArr.length;i++) {
			if(strArr[i].length()<min) {
				min=strArr[i].length();
				minWord=strArr[i];
			}
			
			if(strArr[i].length()>max) {
				max=strArr[i].length();
				maxWord=strArr[i];
			}
		}
		System.out.println("SmallestWord: "+minWord);
		System.out.println("LargestWord: "+maxWord);
		
	}

}
