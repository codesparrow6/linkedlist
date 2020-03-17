package com.java.uttara.Queue;

import java.util.Arrays;

public class QueueArr {
	int first = 0, rear = 0;
	int Deafult_Capacity = 10;
	int queue[];

	public QueueArr() {
		queue = new int[Deafult_Capacity];
	}

	void enqueue(int data) {
		if (rear == queue.length) {
			ensureCapacity();
		}
		else
     		queue[this.rear++] = data;
	}
	void ensureCapacity() {
		int newLen = queue.length * 2;
		queue = Arrays.copyOf(queue, newLen);
	}
	int dequeue() {
        	if(first!=rear) {
        	int val = queue[first];
        	this.first++;
        	return val;
        	}
        	else {
        		System.out.println("Queue is empty,so returning invalid value");
        		return -9;
        	}
        		
        }
}
