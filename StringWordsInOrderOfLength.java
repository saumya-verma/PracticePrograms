package com.more.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class StringWordsInOrderOfLength {
	
	public static void main(String args[]) {
		
		String str="aa a bbscc ahsg ccdd";
		ArrayList<String> strings=new ArrayList<>(Arrays.asList(str.split(" ")));
		
		strings.stream().sorted(Comparator.comparing(s->s.length())).forEach(System.out::println);
		
	}

}
