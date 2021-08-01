package com.practice.programs;

public class QuickSortExample {
	
	public static void main(String args[]) {
		
		int a[] = {5,2,6,9,1,10,3,4};
		int length = a.length;
		quicksort(a,0,length-1);

		for(int i:a) {
			System.out.println(i+" ");
		}
		
	}
	
	static void quicksort(int a[],int lb,int ub) {
		if(lb<ub) {
			int pi = partition(a,lb,ub);
			
			quicksort(a,lb,pi-1);
			quicksort(a,pi+1,ub);
		}
		
	}
	
	static int partition(int a[],int lb,int ub) {
		
		int pivot = a[ub];
		int i =lb-1;
		for(int j=lb;j<=ub-1;j++) {
			
			if(a[j]<=pivot) {
				i++;
				swap(a,i,j);
			}
			
		}
		swap(a,i+1,ub);
		return i+1;
	}
	
	static void swap(int a[],int i, int j) {
		int temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}


}
