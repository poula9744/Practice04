package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] num = new double[5];
		num[0] = sc.nextDouble();
		num[1] = sc.nextDouble();
		num[2] = sc.nextDouble();
		num[3] = sc.nextDouble();
		num[4] = sc.nextDouble();
		
		double average = (num[0] + num[1] + num[2] + num[3] + num[4])/5;
		
		System.out.println("평균은 "+ average + " 입니다.");
		
		sc.close();

	}

}
