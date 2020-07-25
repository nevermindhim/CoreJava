package com.test;

public class LargestPalindrome {
	public static void main(String [] args) {
		LargestPalindrome LP=new LargestPalindrome();
		System.out.println(""+LP.findLP("bananas"));
	}
	public String findLP(String s) {
		if(s.isEmpty())
			return "Enter string";
		if(s.length()==1)
			return s;

	}

}
