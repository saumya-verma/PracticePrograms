package com.more.practice;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		Integer num = scan.nextInt();

		int mid = num / 2;
		int flag = 0;
		if (num == 0 || num == 1) {
			System.out.println("Not a prime number");
		}else {
			for(int i=2; i<=mid;i++) {
				if(num%2==0) {
					System.out.println("Not a prime number");
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("prime number");
		}

	}

}
