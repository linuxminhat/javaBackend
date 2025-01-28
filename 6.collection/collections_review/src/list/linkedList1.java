package list;

import java.util.LinkedList;

public class linkedList1 {
	public static void main(String[] args) {
		LinkedList<String> myLinkedList = new LinkedList<>();
		myLinkedList.add("A");
		myLinkedList.add("B");
		myLinkedList.add("C");
		System.out.println(myLinkedList);
		myLinkedList.addFirst("M");
		System.out.println(myLinkedList);
		myLinkedList.addLast("N");
		System.out.println(myLinkedList);
		myLinkedList.removeFirst();
		System.out.println(myLinkedList);
		myLinkedList.removeLast();
		System.out.println(myLinkedList);
		
	}

}
