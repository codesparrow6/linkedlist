package com.java.uttara;

public class Node {

private Node node;
private int data;

Node(int data){
	this.data=data;
}

public void setNode(Node node){
	this.node=node;
}

public Node getNode(){
	return this.node;
}

public int getData() {
	return data;
}

public void setData(int data) {
	this.data = data;
}


}
