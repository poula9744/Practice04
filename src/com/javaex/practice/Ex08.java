package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		//배열크기
		int[] lottoNoArray = new int[6];
		
		for(int i = 0; i<lottoNoArray.length; i++) {
			//랜덤함수
			lottoNoArray[i] = (int)(Math.random()*45)+1;
			
			//중복이 있을 경우 반복
			for(int j =0; j<i; j++) {
				if(lottoNoArray[i] == lottoNoArray[j]) {
					i--;
					 break;
				}
			}
		}
		
		//출력
		System.out.print(lottoNoArray[0]+ "  " + lottoNoArray[1]+ "  " + lottoNoArray[2]+ "  " 
					     + lottoNoArray[3]+ "  "+ lottoNoArray[4]+ "  " + lottoNoArray[5]);
		
	}

}
