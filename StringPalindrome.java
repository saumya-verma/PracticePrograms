package com.more.practice;

public class StringPalindrome {
	
	public static void main(String args[]) {
		
		String str="Maham";
		str=str.toLowerCase();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
		  rev = rev+str.charAt(i);
		}
		System.out.println(rev);
		
		if(str.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
		
		System.out.println("----------------------------");
		
		//checkPalindrome(str);
		if(checkPalindrome(str))
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
	}
	
	public static Boolean checkPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}
	
	

}
