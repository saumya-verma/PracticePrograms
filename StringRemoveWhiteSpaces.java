package com.more.practice;

public class StringRemoveWhiteSpaces {
	public static void main(String args[]) {
		
		String str="Hey How Are You";
		String withoutSpaces=str.replaceAll("\\s+", "");
		String spacesReplacedWithChar=str.replaceAll("\\s+", "-");
		System.out.println(withoutSpaces);
		System.out.println(spacesReplacedWithChar);
		
		StringBuffer sb= new StringBuffer(str);
		for(int i=0;i<str.length();i++) {
			if(Character.isLowerCase(sb.charAt(i))) {
				sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
			}
			
			else if(Character.isUpperCase(sb.charAt(i))) {
				sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
			}
		}
		
		System.out.println(sb);
		
	}

}
