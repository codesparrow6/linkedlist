package com.java.uttara.Stack;

import com.java.uttara.LinkedList.Node;

public class Stack {
	Node top;
	int size;

	boolean isEmpty(Node top) {
		if (this.top == null)
			return true;
		else
			return false;
	}

	void push(int data) {
		push(this.top, data);
	}

	int pop() {
		return pop(this.top);
	}

	int peak() {
		return peak(this.top);
	}

	// ---------------------------------------------------------------------------------------------------

	void push(Node top, int data) {
		Node node = new Node(data);
		if (null == top) {
			this.top = node;
			size++;
			return;
		} else {
			node.setNext(top);
			this.top = node;
			size++;
			return;
		}
	}

	int pop(Node top) {
		if (!isEmpty(top)) {
			Node temp = top;
			this.top = top.getNext();
			temp.setNext(null);
			return temp.getData();
		} else {
			System.out.println("Stack is empty so, returning invalid value-");
			return -1;
		}
	}

	int peak(Node top) {
		if (!isEmpty(top)) {
			return top.getData();
		} else {
			return -1;
		}
	}

}
