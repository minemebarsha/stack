package com.barsha.stack;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

//This class defines an integer stack that can hold 10 values
public class Stack1 {
	// int stck[] = new int[10];
	ArrayList<Integer> stck = new ArrayList<Integer>();
	int tos;

	// Initialize top-of-stack
	 void Stack() {
	 tos = -1;
	 }

	// Push an item onto the stack
	void push(int item) {
		Integer integer = new Integer(item);
		tos++;
		stck.add(integer);
		
//		System.out.println(tos);
		// if (tos == 9)
		// System.out.println("Stack is full.");
		// else
		// stck[++tos] = item;
	}

	// Pop an item from the stack
	int pop() {
		if (tos < 0) {
			System.out.println("Stack underflow.");
			return 0;
		} else {
			stck.remove(tos);
//			System.out.println(tos);
			return tos--;
		}

	}

	// int pop() {
	// if (tos < 0) {
	// System.out.println("Stack underflow.");
	// return 0;
	// } else
	// return stck[tos--];
	//
	// }

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
