package com.test;
import java.util.*;


public class PrintAscii {
	public static void main(String[] args) {
		System.out.println("Enter character or string to find ASCII");
		Scanner sc=new Scanner(System.in);
		String userInputs =sc.next();
		sc.close();
		char [] userInput=userInputs.toCharArray();
		int ascii=0;
		int [] asciiArray =new int[userInput.length];
		int i=0;
		for(i=0;i<userInput.length;i++) {
			ascii=(int) userInput[i];
			asciiArray[i]=ascii;
			System.out.println("ASCII of "+userInput[i]+" is "+ascii);
		}
		System.out.println(Arrays.toString(asciiArray));
		
	}
}
