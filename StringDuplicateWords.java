package com.more.practice;

import java.util.Arrays;

public class StringDuplicateWords {
	public static void main(String args[]) {

		String str = "Hi how are you hey hi how is everything";
		String strArr[] = str.toLowerCase().split(" ");

		Boolean visited[] = new Boolean[strArr.length];
		Arrays.fill(visited, false);
		for (int i = 0; i < strArr.length; i++) {
			int count = 1;
			if (visited[i] == true)
				continue;

			for (int j = i + 1; j < strArr.length; j++) {
				if (strArr[i].equals(strArr[j])) {
					visited[j] = true;
					count++;
				}
			}
			if (count > 1) {
				System.out.println(strArr[i]);
			}
		}

	}

}
