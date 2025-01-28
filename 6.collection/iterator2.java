package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class iterator2 {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		Iterator<Integer> myIterator1 = myList.iterator();
		while(myIterator1.hasNext()) {
			Integer currentValue = myIterator1.next();
			if(currentValue%2==0) {
				myIterator1.remove();
			}
		}
		System.out.println(myList);
	}

}
