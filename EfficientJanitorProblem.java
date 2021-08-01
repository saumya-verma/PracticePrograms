package com.practice.programs;

import java.util.ArrayList;
import java.util.List;

public class EfficientJanitorProblem {
	
	public static void main(String args[]) {
		
		List<Float> weights = new ArrayList<>();
		weights.add(1.01F);
		weights.add(1.01F);
		weights.add(1.01F);
		weights.add(1.4F);
		weights.add(2.4F);
		
		int n=weights.size();
		Float tripWeight=0.00F;
		int trips=0;
		for(int i=0;i<n;i++) {
			tripWeight = tripWeight+ weights.get(i);
			if(	tripWeight>3.00F) {
				trips+=1;
				System.out.println(tripWeight);
				tripWeight =weights.get(i);
			}
		}
		
		if(tripWeight>0.00F) {
			trips+=1;
		}
		
		System.out.println("No. of trips required: "+trips);
		
	}

}
