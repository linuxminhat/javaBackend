package list;

import java.util.Iterator;
import java.util.List;

public class iteratingIterator2 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6);
		Iterator myListIterator = myList.iterator();
		while(myListIterator.hasNext()) {
			System.out.println(myListIterator.next());
			
		}
	}
}
