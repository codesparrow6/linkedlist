package com.java.uttara.Queue;

import com.java.uttara.LinkedList.Node;

public class Queue implements Cloneable{

	Node f, r; // front,Rear
	public int size;

	public boolean isEmpty() {
		if (this.f == null && this.r == null)
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

	public void enqueue(int data) {
		enqueue(this.f, this.r, data);
	}

	public int dequeue() {
		return dequeue(this.f, this.r);
	}
    
	void reverse() {
		reverse(this.f,this.r,this);
	}

	void enqueue(Node f, Node r, int data) {
		Node node = new Node(data);
		if (this.isEmpty()) {
			this.f = this.r = node;
			this.size++;
			return;
		} else {
			Node temp = r;
			r.setNext(node);
			this.r = node;
			this.size++;
			return;
		}
	}

	int dequeue(Node f, Node r) {
		if (this.isEmpty()) {
			System.out.println("Queue is empty,so returning invalid value");
			return -1;
		} else {
			Node temp =f;
			if (f == r) {                   //Important condition
                this.f=this.r=null;
                this.size--;
				return temp.getData();
			} else {
				this.f = f.getNext();
				temp.setNext(null);			//Important condition
				this.size--;
				return temp.getData();
			}
		}
	}

	//Reversing a queue---------------------------------------------
	void reverse(Node f,Node r,Queue q) {
		if(q.isEmpty())								//Check the overload method for the method signature
			return;
		else {
			int temp = q.dequeue();
			reverse(this.f,this.r,q);
			q.enqueue(temp);
		}
	}

}
