package com.practice.programs;

public class MergePractise {

	int array[];
	int length;
	int tempArr[];
	
	public static void main(String args[]) {
		
		int inputArr[]= {1,8,2,4,3,9,5,13,11};
		MergePractise mp = new MergePractise();
		mp.sort(inputArr);
		
		for(int a:inputArr) {
			System.out.println(a+" ");
		}
		
	}
	
	public void sort(int inputArr[]) {
		
		this.array=inputArr;
		this.length=inputArr.length;
		this.tempArr=new int[length];
		divideArray(0,length-1);
	}
	
	public void divideArray(int lb, int ub) {
		
		if(lb<ub) {
			int middle = lb +(ub-lb)/2;
			divideArray(0,middle);
			divideArray(middle+1,ub);
			merge(lb,middle,ub);
		}
		
	}
	
	public void merge(int lb, int middle, int ub) {
		
		for(int i=lb;i<=ub;i++) {
			tempArr[i] = array[i]; 
		}
		
		int i =lb;
		int j = middle+1;
		int k=lb;
		
		while(i<=middle && j<=ub) {
			
			if(tempArr[i]<tempArr[j]) {
				array[k]= tempArr[i];
				i++;
			}
			else
			{
				array[k]= tempArr[j];
						j++;
			}
			k++;
		}
		
		if(i>middle) {
			while(j<=ub) {
				array[k]=tempArr[j];
				j++;
				k++;
			}
		}
		else {
			while(i<=middle) {
				array[k]=tempArr[i];
				i++;
				k++;
			}
		}
		
		
		
	}
}
