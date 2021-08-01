package com.practice.programs;

public class NumberofGoalsOnPenalty {

	public static void main(String args[]) {

		String str = "1012012112110";
		int len = str.length();
		int gop = 0;
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if (ch == '2' && (i + 1) < len) {
				if (str.charAt(i + 1) == '1') {
					gop++;
				}
			}
		}
		System.out.println("goals on penalty: " + gop);

	}

}
