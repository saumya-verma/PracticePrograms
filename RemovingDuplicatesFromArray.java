package com.more.practice;

public class RemovingDuplicatesFromArray {
	
	public static void main(String args[]) {
		
		int arr[]=new int[] {1,1,5,2,7,1,5};
		
		int withoutDuplicates[] =new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++) {
			int flag=1;
			for(int j=0;j<=k;j++) {
				if(withoutDuplicates[j]==arr[i]) {
					flag=0;
				}
			}
			
			if(flag==1) {
				withoutDuplicates[k]=arr[i];
				k++;
			}
		}
		
		int unique[]=new int[k];
		for(int i=0;i<k;i++) {
			unique[i]=withoutDuplicates[i];
		}
		
		for(int i=0;i<unique.length;i++) {
			System.out.println(unique[i]);
		}
	}

}
