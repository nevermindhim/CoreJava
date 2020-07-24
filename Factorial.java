package com.test;
import java.util.*;
public class Factorial {
	public static void main (String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number \n");
		int number=sc.nextInt();
		sc.close();
		int i=0;
		int temp=1;
		for(i=1;i<=number;i++) {
			temp=temp*number;
		}
		System.out.println("The factorial of number " +number + " is "+ temp);
	}

}
