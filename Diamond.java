package com.sangamone;

public class Diamond {
	public static void main(String[] args) {
		String s="FUNWITHPROGRAMMINGUSINGJAVA";
		int len=s.length();
		int len2=(len/2);
		String s1="";
		String placeholder =" ";

		for(int j=0;j<len2+1;j++) {
			for(int i=0; i<(len2-j); i++) {
				System.out.print(placeholder);
			}
			s1=s.substring(0,len-2*(len2-j));
			System.out.print(s1);
			System.out.println();
		}
	}
}
