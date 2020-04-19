package com.java.uttara.LinkedList;

import java.util.LinkedList;

import com.java.uttara.Stack.Stack;

public class PalindromeLL {


	boolean palindrome(LList ll) {
		Stack st = new Stack();
		
		if(ll.head== null) {
			System.out.println("Linked list is empty");
			return false;
		}
		else {
			Node f=ll.head,s=ll.head;
			while(f!=null && f.getNext()!=null) {
				st.push(s.getData());
				f=f.getNext().getNext();
				s=s.getNext();
			}
			if(f!=null)
				s=s.getNext();
			
			while(!st.isEmpty()) {
				if(st.pop()==s.getData())
					s=s.getNext();
				else
					return false;
			}
			
			return true;
		}
	}
	
	public static void main(String[] args) {
		PalindromeLL p = new PalindromeLL();
		LList ll = new LList();
		ll.append(10);
		ll.append(15);
		ll.append(25);
		ll.append(10);
		
		ll.traversal();
		System.out.println("Palindrome check="+p.palindrome(ll));
	}

}
