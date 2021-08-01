package com.more.practice;

public class Practice1 {

	public static void main(String[] args) {
		
		String s1="ab2c3";
		StringBuffer sb=new StringBuffer();
		String temp="";
		for(int i=0;i<s1.length();i++) {
			char ch= s1.charAt(i);
			if(Character.isAlphabetic(ch)) {
			temp+=ch;
			}
			else if(Character.isDigit(ch)) {
				int m=Integer.parseInt(String.valueOf(ch));
				for(int j=0;j<m;j++) {
					sb.append(temp);
				}
				temp="";
			}
		}
		System.out.println(sb);

	}

}
