package com.more.practice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String args[]) {
		System.out.println("Enter the limit");
		Scanner scan = new Scanner(System.in);
		Integer n = scan.nextInt();

		for (int i = 1; i <= n; i++) {

			if (isArmstrong(i))
				System.out.print(" "+i );
		}
	}

	public static Boolean isArmstrong(int n) {
		int temp = n;
		int r = 0, digits = 0;
		double sum = 0;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp=n;
		
		while (temp > 0) {
			r = temp % 10;
			sum = sum + (Math.pow(r, digits));
			temp = temp / 10;
		}

		if (sum == n)
			return true;
		else
			return false;
	}

}
