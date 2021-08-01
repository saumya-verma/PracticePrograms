package com.practice.programs;

import java.util.Arrays;

public class FrequencyInArray {
	
	public static void main(String args[]) {
		
		int array[]=new int[] {1,5,2,6,2,1,2};
		int n =array.length;
		
		findFrequency(array,n);
		
		
	}
	
	public static void findFrequency(int a[],int n) {
		
		boolean visited[] =new boolean[n];
		Arrays.fill(visited,false);
		
		for(int i=0;i<n;i++) {
			int count =1;
			if(visited[i]==true)
				continue;
			
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]){
					visited[j]=true;
					count++;
				}
			}
			
			System.out.println(a[i]+ " "+ count);
		}
		
	}

}
