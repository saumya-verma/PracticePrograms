package com.more.practice;

public class StringPerfectSubstrings {
	
	static int MAX_CHAR=26;
	
	public static void main(String args[]) {
		
		String str ="aabbcc";
		int k=2;
		
		int num=getNumberOfPerfectSubStrings(str,k);
		
		System.out.println(num);
		
		
	}
	
	
	public static int getNumberOfPerfectSubStrings(String str, Integer k) {
		
		int res=0;
		for(int i=0;i<str.length();i++) {
			
			int freq[]=new int[MAX_CHAR];
			
			for(int j=i;j<str.length();j++) {
				
				int index = str.charAt(j)- 'a';
				freq[index]++;
				
				if(freq[index]>k){
					break;
				}
				
				else if(freq[index]==k && check(freq,k)) {
					res++;
				}
				
			}
		}
		return res;
		
	}

	// Returns true if all values
	// in freq[] are either 0 or k.
	public static Boolean check(int []freq, Integer k) {
		
		for(int i=0;i<MAX_CHAR;i++) {
			if(freq[i]!=0 && freq[i]!=k)
				return false;
		}
		return true;
		
	}
	

}
