package com.practice.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class MostRepeatedWordInTextFile {

	public static void main(String args[]) throws Exception {

		String line,word="";
		ArrayList<String> words= new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader("E:\\Practice_WS\\PracticePrograms\\src\\com\\practice\\programs\\abc.txt"));
		int maxCount=0;
		while((line=br.readLine())!=null) {
			
			//String arr[]=line.toLowerCase().split("([,.\\s]+)");
			String arr[]=line.toLowerCase().split(" ");
			for(String w:arr) {
				words.add(w);
			}
			
		}
		
		Boolean visited[]=new Boolean[words.size()];
		Arrays.fill(visited, false);
		int abc=0;
		for(int i=0;i<words.size();i++) {
			
			if(visited[i]==true)
				continue;
		
			int count=1;
			for(int j=i+1;j<words.size();j++) {
				if(words.get(i).equals(words.get(j))) {
					visited[j]=true;
					count++;
				}
					
			}
			if(count>maxCount) {
				maxCount=count;
				word=words.get(i);
				abc=count;
			}
			
		}
		
		
		System.out.println("most repeated word "+word+" "+abc);
		
		br.close();
		
	}
}