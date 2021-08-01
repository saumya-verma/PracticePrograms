package com.more.practice;

public class CopyArrayElements {

	public static void main(String[] args) {

		int arr[]=new int[] {2,3,4,5,6,7,};
		int copyArr[] =new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			copyArr[i]=arr[i];
		}
		for(int n:copyArr) {
			System.out.println(n);
		}
	}

}
