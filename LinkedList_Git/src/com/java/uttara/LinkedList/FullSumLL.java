package com.java.uttara.LinkedList;

import java.util.LinkedList;

public class FullSumLL {
	
	private Node curNode;
	private int carry;
	
	public Node getCurNode() {
		return curNode;
	}

	public void setCurNode(Node curNode) {
		this.curNode = curNode;
	}

	public int getCarry() {
		return carry;
	}

	public void setCarry(int carry) {
		this.carry = carry;
	}


   public FullSumLL(Node curNode,int carry) {
	   this.curNode=curNode;
	   this.carry=carry;
   }
   
   public FullSumLL() {
   }
   
   LList appendZero(LList ll,int diff) {
	   Node temp = ll.getHead();
	   while(diff>0) {
		   Node n=new Node(0);
		   n.setNext(temp);
		   ll.head=n;
		   diff--;
	   }
	return ll;
   }
   
   LList sum(LList l1, LList l2) {
	   if(l1.getHead()==null && l2.getHead()==null) {
		   System.out.println("Linked Lists are empty");
		   return null;
	   }
	   else if(l1.getHead()==null){
		   return l2;
	   }
	   else if(l2.getHead()==null)
		   return l1;
	   else {
		   
		   int len1 = l1.size;
		   int len2 = l2.size;
           int diff =0;
		   if(len1!=len2) {
			if(len1>len2) {
				diff = len1-len2;
				l2=appendZero(l2,diff);
			}
			else {
				diff = len2-len1;
				l1=appendZero(l1,diff);
			}
		   }
		   
		   
		   FullSumLL fs= fullSum(l1.getHead(), l2.getHead());
		   if(fs.getCarry()==1) {
			  Node n = new Node(fs.getCarry());
			  n.setNext(fs.getCurNode());
			  fs.setCurNode(n);
		   }
		   return new LList(fs.getCurNode());
	   }
		   
   }
   
   FullSumLL fullSum(Node n1,Node n2) {
	   if(n1==null && n2==null) {
		  return new FullSumLL(null, 0);
	   }
	   else {
		   FullSumLL fs = fullSum(n1.getNext(),n2.getNext());
		   int sum = n1.getData() + n2.getData() + fs.getCarry();
		   Node n = new Node(sum%10);
		    n.setNext(fs.getCurNode());   
		    fs.setCurNode(n);
		    fs.setCarry(sum/10);

		    return fs;
	   }
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LList ll = new LList();
		ll.append(4);
		ll.append(5);
		ll.append(1);
		ll.append(5);
		ll.append(3);
		
		LList ll2 = new LList();
		ll2.append(6);
		ll2.append(4);
		ll2.append(1);
		ll2.append(9);
		//ll2.append(15);
		LList l2 = new LList();
		FullSumLL fs= new FullSumLL();
		LList l3=fs.sum(ll, ll2);
		
		l3.traversal();
		
		
	}

}
