package com.java.uttara.LinkedList;

public class MergeLL {

	LList merge(LList l1, LList l2) {
		Node mergeHead = null;
		if (l1.head != null && l2.head != null)
			mergeHead = mergeSort(l1.head, l2.head);

		return new LList(mergeHead);
	}

	Node mergeSort(Node n1, Node n2) {
		Node mN = null, mH = null;

		while (n1 != null && n2 != null) {
			if (n1.getData() < n2.getData()) {
				if (mH == null) {
					mH = n1;
					mN = n1;
				} else {
					mN.setNext(n1);
					mN = n1;
				}
				n1 = n1.getNext();
			} else {
				if (mH == null) {
					mH = n2;
					mN = n2;
				} else {
					mN.setNext(n2);
					mN = n2;
				}
				n2 = n2.getNext();
			}

		}
       return mH;
	}

	public static void main(String[] args) {
		MergeLL mer = new MergeLL();
		LList ll = new LList();
		ll.append(5);
		ll.append(15);
		ll.append(25);
		ll.append(25);
		ll.append(45);
		
		LList ll1 = new LList();
		ll1.append(10);
		ll1.append(10);
		ll1.append(20);
		ll1.append(30);
		ll1.append(40);

		System.out.println("LList1-");
		ll.traversal();
		
		System.out.println("LList2-");
		ll1.traversal();
		
		LList merLL=mer.merge(ll, ll1);
		
		System.out.println("Merged LinkedList-");
		merLL.traversal();
	}
}
