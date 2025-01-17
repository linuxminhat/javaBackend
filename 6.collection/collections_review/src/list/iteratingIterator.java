package list;

import java.util.Iterator;
import java.util.List;

public class iteratingIterator {
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
		Iterator myListIterator = myList.iterator();
		while(myListIterator.hasNext()) {
			System.out.println(myListIterator.next());
		}
	}

}
