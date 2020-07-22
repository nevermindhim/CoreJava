package com.test;
import java.util.*;

public class Palindrome {
	public static void main (String[] args) {
		System.out.println("Program for palindrome");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check for palindrome");
		int number=sc.nextInt();
		sc.close();
		int temp=number;
		int remainder=0;
		int sum=0;
		while(number>0) {
			remainder=number%10;
			sum=(sum*10)+remainder;
			number=number/10;
			System.out.println(remainder);
			System.out.println(sum);
			System.out.println(number);
			System.out.println("\n");
		}
		if(temp==sum) {
			System.out.println("This is palindrome number");
		}
		else {
			System.out.println(temp+ " is not a palindrome number");
		}
		
	}

}
