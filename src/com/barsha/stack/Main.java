package com.barsha.stack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Stack stack = new Stack();
		int i;
		
		System.out.println("type size of stack:");	
		Scanner scanner = new Scanner(System.in);
		i = scanner.nextInt();
		
		
		System.out.println("type elements of stack:");
		for (int j = 0; j < i; j++) {
			
			Scanner scanner2 = new Scanner(System.in);
			int k = scanner.nextInt();
			stack.push(k);
		}
		System.out.println("pushing is completed :D:D");
		System.out.println("stack before popping:");
		stack.print();

		
		System.out.println("stack after popping:");
		stack.pop();
		stack.print();
	}

}
