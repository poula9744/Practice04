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
		for(int j=0; j<lottoNoArray.length; j++) {
			System.out.println(lottoNoArray[j] + " ");
		}
	}
}

//*중복검사 로직은 1개가 아님 --> 다양하게 연구해 볼것

// 중복검사
// i 는 현재 입력된 방번호 <--중복인지 검사해야됨
// j 비교대상 [0]부터 순서대로 검사해서 i 이전방까지 검사
// 비교해서 같은 값 방이 나오면 뒤쪽은 검사하지 않음