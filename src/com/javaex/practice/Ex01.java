package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		
	/*	for ( int i = 0; i<= intArray.length; i++) {
			result = result + intArray[i];
		}
		intArray는 방 이름이 0번부터 시작한다. 
		intArray의 방이 5개인데 i<=5까지면 i=0,1,2,3,4,5 로 방이 하나 모자르게 된다. 
		따라서 i<5가 되도록 부등호 표시를 바꾸어 주어야 한다. 
	*/	
		
		
		for ( int i = 0; i< intArray.length; i++) {
			result = result + intArray[i];
		}
		System.out.println(result);
	}

}
