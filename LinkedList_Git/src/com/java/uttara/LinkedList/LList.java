package com.java.uttara.LinkedList;

public class LList {
	Node head;
	int size;

	// To check head is null or not
	boolean isEmpty(Node node) {
		if (null == node)
			return true;
		else
			return false;
	}

	void append(int data) {
		append(this.head, data);
	}

	void traversal() {
		traversal(this.head);
	}

	int getHead() {
		return this.head.getData();
	}

	void delete(int data) {
		delete(this.head, data);
	}

	Node getMiddle() {
		return getMiddle(this.head);
	}

	void printReverse() {
		printLLReverse(this.head);
	}

	void reverseLL() {
		reverseLL(this.head);
	}
	
	void reverseLLRecur() {
		reverseLLRecur(null,this.head);
	}

	// -----------------------------------------------------------------------------------------
	void append(Node head, int data) {
		Node node = new Node(data);
		if (isEmpty(head)) {
			this.head = node;
			size++;
			return;
		} else {
			Node temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(node);
			size++;
			return;
		}
	}

	void traversal(Node node) {
		if (isEmpty(node)) {
			System.out.println("Linked List has no elements");
			return;
		} else {
			Node temp = node;
			while (temp != null) {
				System.out.println(temp.getData());
				temp = temp.getNext();
			}
			return;
		}
	}

	void delete(Node head, int data) {
		if (isEmpty(head))
			return;       						                            //"Prev" should be initialized
		else {                												//"Prev" should be initialized before check the data match
			Node temp = head;
			if (temp.getData() == data) {
				this.head = temp.getNext();
				temp.setNext(null);
				size--;
				return;
			} else {
				while (temp.getNext() != null) {
					Node prev = temp;
					temp = temp.getNext();
					if (temp.getData() == data) {
						prev.setNext(temp.getNext());
						temp.setNext(null);
						size--;
						return;
					}
				}
			}
		}
	}

	// *****************CRUD Operation are finished************************************

	// -------------Get the middle element of a LL
	Node getMiddle(Node head) {
		if (!isEmpty(head)) {
			Node slow = head, fast = head;
			while (fast != null && fast.getNext() != null) {
				slow = slow.getNext();
				fast = fast.getNext().getNext();
			}
			return slow;
		}
		return null;

	}

	// -------Print a LinkedList in Reverse order without reversing LL
	void printLLReverse(Node node) {
		if (!isEmpty(node)) {
			Node temp = node;
			if (temp == null)
				return;
			else {
				printLLReverse(temp.getNext());
				System.out.println(temp.getData());
			}

		} else
			System.out.println("LL is empty");
	}

	// ------Reverse LL using iterator
	void reverseLL(Node node) {
		if (!isEmpty(node)) {
			Node curr = node;                               //Prev=null; curr=head; 
			Node prev = null;                               //Always do the last Node check w.r.t curr 
			while (curr != null) {
				Node temp = curr.getNext();
				curr.setNext(prev);
				prev = curr;
				curr = temp;
			}
			this.head = prev;
		}
	}

	// ------Reverse LL by recursion
	void reverseLLRecur(Node prev, Node curr) {
		if (!isEmpty(curr)) {
			if (curr.getNext() == null) { 
				this.head = curr;
				curr.setNext(prev);
				return;
			} else
			{
				Node temp = curr.getNext();
				reverseLLRecur(curr, temp);
				curr.setNext(prev);
			}
		}
	}
}