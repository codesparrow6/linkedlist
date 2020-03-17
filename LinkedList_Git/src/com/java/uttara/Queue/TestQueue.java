package com.java.uttara.Queue;

public class TestQueue {

	public static void main(String[] args) {
      
		Queue q=new Queue();
	    q.enqueue(10);
	    q.enqueue(20);
	    q.enqueue(30);
	    q.enqueue(40);
	    q.enqueue(50);
	    
	    System.out.println("First ="+q.getFirst());
	    System.out.println("Rear ="+q.getRear());
	    System.out.println("Dequeue ="+q.dequeue());
	    System.out.println("--------------------------------------------------------------------------------");
	    System.out.println("First ="+q.getFirst());
	    System.out.println("Rear ="+q.getRear());
	    System.out.println("--------------------------------------------------------------------------------");
	    
	    q.reverse();
	    System.out.println("First ="+q.getFirst());
	    System.out.println("Rear ="+q.getRear());
	    System.out.println("Dequeue ="+q.dequeue());
	    System.out.println("Dequeue ="+q.dequeue());
	}

}
