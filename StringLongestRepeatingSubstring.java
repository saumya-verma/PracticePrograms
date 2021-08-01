package com.more.practice;

public class StringLongestRepeatingSubstring {

	public static void main(String args[]) {
		String str = "abcdpoabcdabcde";
		int n = str.length();
		String lrs = "";
		for (int i = 1; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				String x = getHighestCommonSubtring(str.substring(i, n), str.substring(j, n));

				if (x.length() > lrs.length())
					lrs = x;
			}

		}
		System.out.println("Longest repeating substring: " + lrs);

	}

	public static String getHighestCommonSubtring(String s, String t) {

		int n = Math.min(s.length(), t.length());

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) != t.charAt(i)) {
				return s.substring(0, i);
			}
		}
		return s.substring(0, n);

	}

}
