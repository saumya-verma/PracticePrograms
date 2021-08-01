package com.more.practice;

import java.util.ArrayList;

public class EfficientJanitor {
	
	public static void main(String args[]) {
		
		ArrayList<Float> weights = new ArrayList<>();
		weights.add(1.01F);
		weights.add(1.01F);
		weights.add(1.01F);
		weights.add(1.4F);
		weights.add(2.4F);
		
		int trips=0;
		Float sum=0.00F;
		
		for(int i=0;i<weights.size();i++) {
			sum=sum+weights.get(i);
			if(sum>3.00F) {
				trips++;
				sum = weights.get(i);
			}
			
		}
		
		if(sum>0.00F)
		{
			trips++;
		}
		System.out.println(trips);
	
	}

}
