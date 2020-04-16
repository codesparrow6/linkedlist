package com.java.uttara.DoublyLinkedList;

public class DoublyLList {
	DNode head;
	int size;

	boolean isEmpty(DNode node) {
		if (null == node)
			return true;
		else
			return false;
	}
    
	int getHead() {
		return this.head.getData();
	}
	
	void append(int data) {
		append(this.head, data);
	}

	void traversal() {
		traversal(this.head);
	}

	void delete(int data) {
		delete(this.head, data);
	}

	// --------------------------------------------------------------------------

	void append(DNode head, int data) {
		DNode n = new DNode(data);
		if (isEmpty(head)) {
			this.head = n;
			size++;
			return;
		} else {
			DNode temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(n);
			n.setPrev(temp);
			size++;
		}
	}

	void traversal(DNode head) {
		if (!isEmpty(head)) {
			DNode temp = head;
			while (temp != null) {
				System.out.println(temp.getData());
				temp = temp.getNext();
			}
			System.out.println("Size of DLL =" + this.size);
		} else {
			System.out.println("Doubly LinkedList is empty");
		}
	}

	void delete(DNode head, int data) {
		if (isEmpty(head)) {
			System.out.println("DLL is Empty");
			return;
		} else {
			DNode temp = head;
			if (this.head.getData() == data) {
				DNode node = temp.getNext();
				this.head = node;
				node.setPrev(null);
				temp.setNext(null);
				size--;
				return;
			} else {
				while (temp.getNext() != null) {
					DNode prev = temp;
					temp = temp.getNext();
					if (temp.getData() == data) {
						prev.setNext(temp.getNext());
						if (temp.getNext() != null)          //This condition is important
							temp.getNext().setPrev(prev);
						temp.setNext(null);
						temp.setPrev(null);
						size--;
					}
				}
			}
		}
	}
}
