package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) { 
		
		int[] intA = { 3, 6, 9 };
		
		int[] intB;
		intB = intA;
		intB[0] = 20; 
		intB[2] = 10;
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
		}
	}

	}

/* [예상] 
   intA[0] = 3
   intA[1] = 6
   intA[2] = 9
   
   intB에 intA를 주소값 복사 == 같은 메모리 공간 사용
   
   intB[0] = 3
   intB[1] = 6
   intB[2] = 9
    
   intB[0]와 intB[2]에 새로운 숫자 넣기
   intB[0] = 20
   intB[2] = 10
   
   intB와 intA는 동일한 메모리 공간을 사용하기 때문에 
   intA[0] = 20 
   intA[1] = 6
   intA[2] = 10
   
  반복문 >> i=0부터 i<3까지 intA[i] 출력을 반복 
  20
  6
  10
   
   
 * 
 */
