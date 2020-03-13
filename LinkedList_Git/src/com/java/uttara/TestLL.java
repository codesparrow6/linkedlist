package com.java.uttara;

public class TestLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LList ll = new LList();
	    System.out.println("Appending data is started");
		ll.append(40);
		ll.append(5);
		ll.append(10);
		ll.append(45);
		ll.append(15);

		System.out.println("Appending data is completed");
		System.out.println("Printing Linked List of Size ="+ ll.size + " --------");
		ll.traversal();
		System.out.println("Head = "+ ll.getHead());	
		
		ll.delete(45);
		System.out.println("New Head = "+ ll.getHead());	
		System.out.println("Printing Linked List of Size ="+ ll.size + " --------");
		ll.traversal();
		
	}

}
