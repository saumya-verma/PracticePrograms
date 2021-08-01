package com.more.practice;

public class StringDivideEqualParts {

	public static void main(String args[]) {

		String str = "HeyHowAreYou";
		int n = 4;
		String equals[] = new String[n];
		int temp = 0;
		if (str.length() % n != 0) {
			System.out.println("Cant divide the string in equal parts");
		} else {

			int quotient = str.length() / n;
			for (int i = 0; i < str.length(); i = i + quotient) {
				String substr = str.substring(i, i + quotient);
				equals[temp] = substr;
				temp++;
			}

			for (String s : equals) {
				System.out.println(s);
			}

		}

	}

}
