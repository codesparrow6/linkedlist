package com.java.uttara.Stack;

import com.java.uttara.LinkedList.Node;

public class Stack {
	Node top;
	int size;

	public boolean isEmpty() {
		if (this.top == null)
			return true;
		else
			return false;
	}

	public void push(int data) {
		push(this.top, data);
	}

	public int pop() {
		return pop(this.top);
	}

	public int peak() {
		return peak(this.top);
	}

	// ---------------------------------------------------------------------------------------------------

	void push(Node top, int data) {				    //Understand the functionality of Push.
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
		if (!this.isEmpty()) {
			Node temp = top;
			this.top = top.getNext();
			temp.setNext(null);            			  //Important condition
			return temp.getData();
		} else {
			System.out.println("Stack is empty so, returning invalid value-");
			return -1;
		}
	}

	int peak(Node top) {
		if (!this.isEmpty()) {
			return top.getData();
		} else {
			return -1;
		}
	}


}
