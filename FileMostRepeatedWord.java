package com.more.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileMostRepeatedWord {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(
				new FileReader("E:\\Practice_WS\\PracticePrograms\\src\\com\\practice\\programs\\abc.txt"));

		List<String> strings = new ArrayList<>();
		String line="";
		while ((line = br.readLine()) != null) {
			String arr[] = line.toLowerCase().split(" ");
			for (String s : arr) {
				strings.add(s);
			}

		}
		System.out.println("No.of words in the file "+strings.size());
		
		
		Boolean visited[]=new Boolean[strings.size()];
		Arrays.fill(visited, false);
		int max=Integer.MIN_VALUE;
		String maxUsedWord="";
		for(int i=0;i<strings.size();i++) {
			int count=1;
			if(visited[i]==true)
				continue;
			for(int j=i+1;j<strings.size();j++) {
				if(strings.get(i).equals(strings.get(j))) {
					visited[i]=true;
					count++;
				}
			}
			if(count>max) {
				max=count;
				maxUsedWord=strings.get(i);
			}
			
		}
		
		System.out.println("Most Repeated word: "+maxUsedWord);
		

	}

}
