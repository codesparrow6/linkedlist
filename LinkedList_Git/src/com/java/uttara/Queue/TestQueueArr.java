package com.java.uttara.Queue;

public class TestQueueArr {

	public static void main(String[] args) {
		QueueArr q=new QueueArr();
	    q.enqueue(10);
	    q.enqueue(20);
	    q.enqueue(30);
	    q.enqueue(40);
	    q.enqueue(50);
	    
	    System.out.println("Dequeue ="+q.dequeue());
	    System.out.println("--------------------------------------------------------------------------------");
	    System.out.println("Dequeue ="+q.dequeue());
	    System.out.println("--------------------------------------------------------------------------------");
	    System.out.println("Dequeue ="+q.dequeue());
	    System.out.println("--------------------------------------------------------------------------------");
	    System.out.println("Dequeue ="+q.dequeue());
	    System.out.println("--------------------------------------------------------------------------------");
	    System.out.println("Dequeue ="+q.dequeue());
	    System.out.println("--------------------------------------------------------------------------------");
	    System.out.println("Dequeue ="+q.dequeue());
	    System.out.println("--------------------------------------------------------------------------------");
	    System.out.println("Dequeue ="+q.dequeue());
	}

}
