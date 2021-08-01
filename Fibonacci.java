package com.more.practice;

public class Fibonacci {
	
	public static void main(String args[]) {
		
		int a=0, b= 1;
		int c;
		int n =10;
		System.out.print(a+" "+b);
		
		for(int i=3;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
		
	}

}
