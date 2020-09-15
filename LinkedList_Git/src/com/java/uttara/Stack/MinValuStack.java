package com.java.uttara.Stack;

import java.util.Arrays;

public class MinValuStack {

	Stack genSt = new Stack();
	Stack minSt = new Stack();

	void push(int data) {
		genSt.push(data);

		if (minSt.isEmpty() || data <= minSt.peak())
			minSt.push(data);
	}

	int pop() {
		int data = 0;
		if (!genSt.isEmpty())
			data = genSt.peak();

		if (data == minSt.peak())
			minSt.pop();

		return genSt.pop();

	}

	int getMin() {
		if (!minSt.isEmpty())
			return minSt.peak();
		else
			return -999;
	}

	int peak() {
		if (!genSt.isEmpty())
			return genSt.peak();
		else
			return -999;
	}

	public static void main(String[] args) {                  //Verfied all the cases which includes - duplicate data & adding data in ascending order tpo Genstack
		MinValuStack stack = new MinValuStack();
		stack.push(8);
		stack.push(90);
		stack.push(8);

		System.out.println("Min Value =" + stack.getMin());
		System.out.println("Pop =" + stack.pop());
		System.out.println("Peak=" + stack.peak());
		System.out.println("Min Value =" + stack.getMin());
		System.out.println("Pop =" + stack.pop());
		System.out.println("Peak=" + stack.peak());
		System.out.println("Min Value =" + stack.getMin());

		stack.push(50);
		System.out.println("Min Value =" + stack.getMin());
		System.out.println("Pop =" + stack.pop());
		System.out.println("Peak=" + stack.peak());
		System.out.println("Min Value =" + stack.getMin());
		
		String[] array = { "a", "b", "c" };
		System.out.println("String"+Arrays.toString(array));
		
		String str = " \"interface_name\":\"eth-0/0/1\" ";
		String result = str.replaceAll("[\"]","").trim();
		boolean fla = result.startsWith("interface_name");
		System.out.println("Result ="+result+ " Flag ="+fla);
		
	}

}
