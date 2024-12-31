package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class iterator4 {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		Iterator<Integer> myIterator = myList.iterator();
		while(myIterator.hasNext()) {
			Integer myNumb=myIterator.next();
			if(myNumb%2==0) {
				myIterator.remove();
			}
		}
		System.out.println(myList);
	}

}
