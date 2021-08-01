package com.more.practice;

import java.util.Arrays;

public class StringDuplicateCharacters {

	public static void main(String args[]) {

		String str = "ababaakjl";
		Boolean visited[] = new Boolean[str.length()];
		Arrays.fill(visited, false);

		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			if (visited[i] == true)
				continue;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					visited[j] = true;
					count++;
				}
			}
			if (count > 1) {
				System.out.println(str.charAt(i));
			}
		}

	}

}
