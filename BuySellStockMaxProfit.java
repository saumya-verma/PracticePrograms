package com.more.practice;

public class BuySellStockMaxProfit {

	public static void main(String[] args) {

		int prices[]= new int[]{7,6,4,3,1,11};
		int min=Integer.MAX_VALUE;
		int profit=0;
		
		for(Integer price:prices) {
			if(price<min) {
				min=price;
			}else if(price-min>profit){
				profit=price-min;
			}
		}
		System.out.print(profit);
	}

}
