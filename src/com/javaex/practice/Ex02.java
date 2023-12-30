package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		
		double[] doubleArray = new double[3];
		
		doubleArray[0] = 1.2;
		doubleArray[1] = 3.3;
		doubleArray[2] = 6.7;

		for(int i=doubleArray.length-1; i>=0; i--) {
		System.out.println(doubleArray[i]);
		}
	}

}
