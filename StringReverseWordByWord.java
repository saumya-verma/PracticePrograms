package com.more.practice;

public class StringReverseWordByWord {
	
	public static void main(String args[]) {
		
		String str ="Hey how are you doing";
		
		String arr[]=str.split(" ");
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
