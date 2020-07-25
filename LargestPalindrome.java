package com.test;
import java.util.*;

public class LargestPalindrome {
	public static void main(String [] args) {
		LargestPalindrome LP=new LargestPalindrome();
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String stringToCheck= sc.nextLine();
		sc.close();
		System.out.println("The longest palindrome is "+LP.findLP(stringToCheck));
	}
	public String findLP(String s) {
		if(s.isEmpty())
			return "Enter string";
		if(s.length()==1)
			return s;
		String longest="";
		int i=0;
		longest=s.substring(0, 1);
		for(i=0;i<s.length();i++) {
			String tmp = check(s, i, i);
			if (tmp.length() > longest.length()) {
                longest = tmp;
            }
            tmp = check(s, i, i + 1);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
        }
        return longest;
	}
	public String check(String s, int begin, int end) {
        while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
        return s.substring(begin + 1, end);    
    }

}
