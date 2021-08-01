package com.practice.programs;

public class BubbleSortExample {
	
	public static void main(String args[]) {
		
		int arr[]= {5,3,4,6,8,1,2};
		BubbleSortExample  bs = new BubbleSortExample();
		bs.bubbleSort(arr);
		System.out.println("After sorting");
		bs.printArray(arr);
		
	}
	
	void bubbleSort(int arr[]) {
		
		int n = arr.length;
		int temp;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}
	
	void printArray(int arr[]){
		for(int i:arr) {
	System.out.println(i+" ");		
		}
	}
}
// avg and worst complexity = O(n*n). Best O(n)