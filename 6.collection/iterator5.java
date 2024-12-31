package Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class iterator5 {
	public static void main(String[] args) {
		List<String> myList = new Vector<>(Arrays.asList("Dang","Nhat","Minh"));
		Iterator<String> myIterator = myList.iterator();
		while(myIterator.hasNext()) {
			String myString=myIterator.next();
			if(myString.contains("nh")) {
				myIterator.remove();
			}
		}
		System.out.println(myList);
	}

}
