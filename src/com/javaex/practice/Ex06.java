package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		
		
		
		//char d[] = {'T','h','i','s',',','i','s',',','a',',','p','e','n','c','i','l'};
		for(int i=0; i<c.length; i++) {
			if(c[i] == ' ') {
				c[i] = ',';
			}
		}
		//출력
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]);
		}
	}

}
