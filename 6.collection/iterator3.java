package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class iterator3 {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		System.out.println(myList);
		Iterator<Integer> listIterator = myList.iterator();
		while(listIterator.hasNext()) {
			Integer myValue = listIterator.next();
			if(myValue%2==0) {
				listIterator.remove();
			}
		}
		System.out.println(myList);
	}

}
