package com.more.practice;

public class SumOfElementsInArrayExceptI {
	
	public static void main(String args[]) {
		
		int[] arr1= new int[]{1,2,3};
		int arr2[] = new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
			int sum=0;
			for(int j=0;j<arr1.length;j++) {
				if(i==j)
					continue;
				else {
					sum=sum+arr1[j];
				}
			}
			arr2[i]=sum;
			
		}
		
		for(int res:arr2) {
			System.out.println(res);
		}
	}

}
