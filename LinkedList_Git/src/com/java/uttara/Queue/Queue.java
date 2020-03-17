package com.java.uttara.Queue;

import com.java.uttara.LinkedList.Node;

public class Queue {

	Node f, r; // front,Rear
	int size;

	boolean isEmpty(Node f, Node r) {
		if (f == null && r == null)
			return true;
		else
			return false;
	}

	int getFirst() {
		return ((this.f != null) ? this.f.getData() : -1);
	}

	int getRear() {
		return ((this.r != null) ? this.r.getData() : -1);
	}

	void enqueue(int data) {
		enqueue(this.f, this.r, data);
	}

	int dequeue() {
		return dequeue(this.f, this.r);
	}
    
	void reverse() {
		reverse(this.f,this.r,this);
	}
	void enqueue(Node f, Node r, int data) {
		Node node = new Node(data);
		if (isEmpty(f, r)) {
			this.f = this.r = node;
			return;
		} else {
			Node temp = r;
			r.setNext(node);
			this.r = node;
			return;
		}
	}

	int dequeue(Node f, Node r) {
		if (isEmpty(f, r)) {
			System.out.println("Queue is empty,so returning invalid value");
			return -1;
		} else {
			Node temp =f;
			if (f == r) {
                this.f=this.r=null;
				return temp.getData();
			} else {
				this.f = f.getNext();
				temp.setNext(null);
				return temp.getData();
			}
		}
	}
	
	//Reversing a queue---------------------------------------------
	void reverse(Node f,Node r,Queue q) {
		if(q.isEmpty(f, r))
			return;
		else {
			int temp = q.dequeue();
			reverse(this.f,this.r,q);
			q.enqueue(temp);
		}
	}

}
