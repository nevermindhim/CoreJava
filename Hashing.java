package com.test;
import java.util.*;
public class Hashing {
	static void createHashMap(int a[]) {
		HashMap<Integer, Integer> hMap= new HashMap<Integer, Integer>();
		for (int i=0;i<a.length;i++) {
			Integer c = hMap.get(a[i]);
//			System.out.println(c);
			if(hMap.get(a[i])==null) {
				hMap.put(a[i],1);
				System.out.println("If"+a[i]);
				System.out.println(hMap);
			}
			else {
				hMap.put(a[i],++c);
				System.out.println("Else"+a[i]);
				System.out.println(hMap);
			}
		}
		System.out.println(hMap);
	}
	
	public static void main(String [] args) {
		int arr[]= {10,34,5,10,3,5,10};
		createHashMap(arr);
	}
}
