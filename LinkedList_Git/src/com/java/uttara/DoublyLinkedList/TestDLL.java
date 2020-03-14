package com.java.uttara.DoublyLinkedList;

public class TestDLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            DoublyLList dll = new DoublyLList();
            
            dll.append(10);
            dll.append(20);
            dll.append(30);
            dll.append(40);
            dll.append(50);
            dll.append(-10);
            dll.append(0);
            System.out.println("Head ="+dll.getHead());
            dll.traversal();
            
            dll.delete(10);
            System.out.println("Head ="+dll.getHead());
            dll.traversal();
            
	}

}
