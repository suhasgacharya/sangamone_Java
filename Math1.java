package com.sangamone;

public class Math1 {

	public static void main(String[] args) {
		int count=100;
		for(int j=2;j<count;j++) {
			for(int i=0;i<(count/j)+1;i++) {
				System.out.print(j*i+" ");
			}
			System.out.println();
		}	
	}

}