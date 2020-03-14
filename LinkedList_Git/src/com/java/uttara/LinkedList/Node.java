package com.java.uttara.LinkedList;

public class Node {

private Node next;
private int data;

Node(int data){
	this.data=data;
}

public void setNext(Node node){
	this.next=node;
}

public Node getNext(){
	return this.next;
}

public int getData() {
	return data;
}

public void setData(int data) {
	this.data = data;
}


}
