package com.java.uttara.Stack;

public class TestStackArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackArr s = new StackArr();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);

		System.out.println("Peak =" + s.peak());
		System.out.println("Pop value =" + s.pop());
		System.out.println("Peak =" + s.peak());

		System.out.println("Pop value =" + s.pop());
		System.out.println("Peak =" + s.peak());
}

}
