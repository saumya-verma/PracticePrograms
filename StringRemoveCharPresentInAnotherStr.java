package com.more.practice;

public class StringRemoveCharPresentInAnotherStr {
	
	static int MAX=256; 
	
	public static void main(String args[]) {
		
		String str1="computer";
		String str2="cat";
		
		String rStr=removeChar(str1,str2);
		
		System.out.println(rStr);
		
//		String s="aaabccdddd";
//		int trial[]=new int[26]; 
//		for(int i=0;i<s.length();i++) {
//			trial[s.charAt(i)-'a']++;
//		}
//		for(int i:trial) {
//			System.out.println(i);
//		}
//		
		
	}
	
	public static String removeChar(String str1,String str2) {
		
		char str1Arr[]=str1.toCharArray();
		int rdex=0;
        int str2Freq[]=getStr2Freq(str2);		
        
        for(int i=0;i<str1.length();i++) {
        	char ch = str1Arr[i];
        	if(str2Freq[ch]==0) {
        		str1Arr[rdex]=str1Arr[i];
        		rdex++;
        	}
        }
        	
        str1=new String(str1Arr);
		return str1.substring(0,rdex);
		
	}

	public  static int[] getStr2Freq(String str2) {
		int freq[]= new int[MAX];
		for(int i=0;i<str2.length();i++) {
			int index = str2.charAt(i);
			freq[index]++;
		}
		return freq;
	}

}
