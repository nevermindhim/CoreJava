package com.test;
import java.util.*;
public class Fibonacci {
	public static void main(String [] args) {
		System.out.println("Program for fibonacci series");
		int n=0;
		System.out.println("Enter the value of 'n'");
		Scanner sc =new Scanner(System.in);
		n= sc.nextInt();
		sc.close();
		int i=0;
		int firstFibNo =0;
		int secondFibNo =1;
		int temp=firstFibNo;
		System.out.println("The Fibonacci series for "+n+ " is");
		for (i=0;i<=n;i++) {
			System.out.println(firstFibNo);
			temp=firstFibNo+secondFibNo;
			firstFibNo=secondFibNo;
			secondFibNo=temp;
		}
	}

}
