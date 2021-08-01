package com.more.practice;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n=454;
		//int n=3631;
		int temp =n;
		int r=0;
		int s=0;
		while(n>0) {
			r=n%10;
			s=(s*10)+r;
			n=n/10;
			
		}
		if(temp==s) {
			System.out.println("Palindrome");
		}else
		{
			System.out.println("Not a palindrome");
		}
		
	}

}
