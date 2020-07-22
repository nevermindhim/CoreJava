package com.test;

public class Fibonacci {
	public static void main(String [] args) {
		System.out.println("Program for fibonacci series");
		int n=10;
		int i;
		int firstFibNo =0;
		int secondFibNo =1;
		int temp=firstFibNo;
		for (i=0;i<=n;i++) {
			System.out.println(firstFibNo);
			temp=firstFibNo+secondFibNo;
			firstFibNo=secondFibNo;
			secondFibNo=temp;
		}
	}

}
