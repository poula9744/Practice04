package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] numArray = new double[5];
		int num;
		double sum = 0;
		double average;
		
		for(int i=0; i<numArray.length; i++) {
			num = sc.nextInt();
			numArray[i] = num;
		}
		
		for (int i=0; i<numArray.length; i++) {
			sum = sum + numArray[i];
		}
		average = sum/numArray.length;
		
		System.out.println("평균은 "+ average + " 입니다.");
		
		sc.close();

	}

}
