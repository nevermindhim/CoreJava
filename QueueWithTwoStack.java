package com.test;

import java.util.Stack;

public class QueueWithTwoStack {
	static class Queue{
		Stack<Integer> s1;
		Stack<Integer> s2;
	}
	static void push(Stack<Integer> s,int num) {
		s.push(num);
	}
	static int pop(Stack<Integer> s) {
		if (s.isEmpty()) {
			System.out.println("Underflow");
			System.exit(0);
		}
		return s.pop();
	}
	static void enQueue(Queue q, int x) {
		push(q.s1,x);
	}
	static int deQueue(Queue q) {
		int x=0;
		if(q.s1.isEmpty() && q.s2.isEmpty()) {
			System.out.println("No items in queue");
			System.exit(1);
		}
		if(q.s2.isEmpty()) {
			while(!q.s1.isEmpty()) {
				
			}	
		}
		return x;
		
	}
	public static void main(String[] args) {
		
	}

}
