package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class iteratingAdvanced4 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>(myList);
		System.out.println(myLinkedList);
		Iterator<Integer> myLinkedListIterator = myLinkedList.iterator();
		while(myLinkedListIterator.hasNext()==true) {
			if(myLinkedListIterator.next().intValue()%2==0) {
				myLinkedListIterator.remove();
			}
		}
		System.out.println(myLinkedList);
	}

}
