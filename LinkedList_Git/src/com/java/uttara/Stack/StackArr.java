package com.java.uttara.Stack;

import java.util.Arrays;

public class StackArr {

	int top;
	int Default_capacity = 10;
	int[] stack = null;

	public StackArr() {
		stack = new int[Default_capacity];
	}

	void push(int data) {
		if (top == stack.length) {
			ensureCapacity();
		}
		stack[this.top++] = data;
	}

	void ensureCapacity() {
		int newLen = stack.length * 2;
		stack = Arrays.copyOf(stack, newLen);
	}

	// NOTE :- 1.Top will be pointing to the empty/undefined value.So,inorder to pop we have to decrease the Top by '1' first and get the value.
	//         2.Same thing applies for Peak also.
	int pop() {
		if (top < 0) {
			System.out.println("Stack is under flow");
			return 0;
		} else {
			int val = stack[this.top - 1];
			this.top--;
			return val;
		}
	}

	int peak() {
		if (top < 0) {
			System.out.println("Stack is under flow");
			return 0;
		} else {
			return stack[top - 1];
		}
	}
}
