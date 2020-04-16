package com.java.uttara.Queue;

import com.java.uttara.Stack.Stack;

public class QueueImplStack {
	Stack s1 = new Stack();
	Stack s2 = new Stack();

	void enqueue(int data) {
		if(!s2.isEmpty())
		  this.s2.push(data);
		else 
			this.s1.push(data);
	}

	int dequeue() {
		if (s1.isEmpty() && s2.isEmpty()) {
			System.out.println("Stacks are empty");
			return -1;
		} else if (!s2.isEmpty())
			return this.s2.pop();
		else {
			while (!s1.isEmpty()) {
				this.s2.push(s1.pop());
			}
			return this.s2.pop();
		}
	}

	public static void main(String[] args) {
		QueueImplStack q = new QueueImplStack();
		q.enqueue(100);
		q.enqueue(200);
		q.enqueue(300);
		q.enqueue(400);
		q.enqueue(500);

		System.out.println("dequeue = " + q.dequeue());
		System.out.println("dequeue = " + q.dequeue());
		System.out.println("dequeue = " + q.dequeue());
		
		q.enqueue(4000);
		
		System.out.println("dequeue = " + q.dequeue());
		System.out.println("dequeue = " + q.dequeue());
		System.out.println("dequeue = " + q.dequeue());
		
	}

}
