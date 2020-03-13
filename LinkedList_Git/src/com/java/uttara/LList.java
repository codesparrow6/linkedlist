package com.java.uttara;

public class LList {
    Node head;
    int size;
    
    //To check head is null or not
	boolean isEmpty(Node node){
		if(null == node)
			return true;
		else 
			return false;
	}
    
	void append(int data){
		append(this.head,data);
	}
	
    void traversal(){
	   traversal(this.head);	
	}
    
    int getHead(){
    	return this.head.getData();
    }
    
    void delete(int data){
    	delete(this.head,data);
    }
	//-----------------------------------------------------------------------------------------
	void append(Node head,int data){
		Node node = new Node(data);
		if(isEmpty(head)){
			this.head=node;
			size++;
			return;
	    }
		else{
			Node temp = head;	
			while(temp.getNext() != null){
				temp=temp.getNext();
			}
			temp.setNext(node);
			size++;
			return;
		}
	}
	
	void traversal(Node node){
		if(isEmpty(node)){
		    System.out.println("Linked List has no elements");
			return;
		}
		else
		{
			Node temp = node;
			while(temp != null){
				System.out.println(temp.getData());
				temp = temp.getNext();
			}
			return;
		}
	}
	
	void delete(Node head,int data){
		if(isEmpty(head))
			return;
		else{
			Node temp = head;
			if(temp.getData()== data){
				this.head=temp.getNext();
				temp.setNext(null);
				size--;
				return;
			}
			else{
				while(temp.getNext()!= null){
					Node prev = temp;
					temp = temp.getNext();
					if(temp.getData() == data){
						prev.setNext(temp.getNext());
						temp.setNext(null);
						size--;
						return;
					}
				}
			}
		}
	}
	
}
