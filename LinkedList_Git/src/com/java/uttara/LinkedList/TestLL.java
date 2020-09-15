package com.java.uttara.LinkedList;

public class TestLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LList ll = new LList();
	    System.out.println("Appending data is started");
		ll.append(40);
		ll.append(5);
		System.out.println("Size ="+ll.size);
		ll.append(10);
		ll.append(45);
		ll.append(15);

		
		String str = "0032.1721.00d9";
				System.out.println("String Org ="+str);
				str = str.replace(".","");
				System.out.println("String replace ="+str);
				int len= str.length();
				StringBuffer strBuf = new StringBuffer();
				strBuf.append(str);
				int i=2;
				while(i<strBuf.length()) {
					strBuf.insert(i, ":");
					i=i+3;
				}
				str= strBuf.toString();
				System.out.println("String buffer converted ="+str);
				
		System.out.println("Appending data is completed");
		System.out.println("Printing Linked List of Size ="+ ll.size + " --------");
		ll.traversal();
		System.out.println("Head = "+ ll.getHead());	
		if(ll.getMiddle()!=null)
		 System.out.println("Get Middle of LL ="+ll.getMiddle().getData());
		else
		 System.out.println("Head is null");
		
		ll.delete(45);
		System.out.println("New Head = "+ ll.getHead());	
		System.out.println("Printing Linked List of Size ="+ ll.size + " --------");
		ll.traversal();
		
		if(ll.getMiddle()!=null)
		 System.out.println("Get Middle of LL ="+ll.getMiddle().getData());
		else
		 System.out.println("Head is null");
		
		System.out.println("Print LL in reverse order:");
		ll.printReverse();
		
		
		System.out.println("Print LL after reversing -");
		ll.reverseLL();
		System.out.println("Head = "+ ll.getHead());
		ll.traversal();
		
		System.out.println("Print LL after reversing -");
		ll.reverseLLRecur();
		System.out.println("Head = "+ ll.getHead());
		ll.traversal();
	}

}
