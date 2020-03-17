package com.java.uttara.Stack;

public class TestStack {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);

		System.out.println("Peak =" + s.peak());
		System.out.println("Pop value =" + s.pop());
		System.out.println("Peak =" + s.peak());

	}
}
