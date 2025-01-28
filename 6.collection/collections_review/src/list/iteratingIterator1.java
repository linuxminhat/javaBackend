package list;

import java.util.Iterator;
import java.util.List;

public class iteratingIterator1 {
	public static <E> void main(String[] args) {
		List<String> myList = List.of("Dang","Nhat","Minh");
		System.out.println(myList);
		Iterator<String> myListIterator = myList.iterator();
		while(myListIterator.hasNext()) {
			System.out.println(myListIterator.next());
		}
	}

}
