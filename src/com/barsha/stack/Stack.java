package com.barsha.stack;

import java.util.ArrayList;

public class Stack {
	
	
	ArrayList<Integer> stck = new ArrayList<Integer>();
	int tos;
	
	
	public Stack() {
		tos = -1;
	}
	 
	 
	public void push(int item) {
		Integer integer = new Integer(item);
		tos++;
		stck.add(integer);
	}
	
	
	public int pop() {
		if (tos < 0) {
			System.out.println("Stack underflow.");
			return 0;
		} else {
			stck.remove(tos);
			return tos--;
		}
	}
	
	
	public void print() {

		if (tos == -1) {
			System.out.println("stack is empty");

		} else {
			for (int i = 0; i < stck.size(); i++) {
				System.out.println(stck.get(i));
			}

		}
	}

}
