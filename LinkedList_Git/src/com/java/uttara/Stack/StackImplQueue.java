package com.java.uttara.Stack;

import com.java.uttara.Queue.Queue;

public class StackImplQueue {

	Queue q1 = new Queue();
	Queue q2 = new Queue();
	
	void push(int data) {
		if(!q1.isEmpty())
	      this.q1.enqueue(data);
		else
		  this.q2.enqueue(data);
	}
	
	int pop() {
		if(q1.isEmpty() && q2.isEmpty())
			return -1;
		else if(!q1.isEmpty()){
			int len1 = q1.size;
			for(int i=1;i<len1;i++)
				q2.enqueue(q1.dequeue());
			
			return q1.dequeue();
		}
		else {
			int len2 = q2.size;
			for(int j=1;j<len2;j++)
				q1.enqueue(q2.dequeue());
			
			return q2.dequeue();
		}
	}
	
	
	public static void main(String[] args) {

		StackImplQueue s = new StackImplQueue();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		System.out.println("1st pop ="+s.pop());
		s.push(50);
		s.push(60);
		System.out.println("2nd pop ="+s.pop());
		
	}

}
