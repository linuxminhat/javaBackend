package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class iterator1 {
	public static void main(String[] args) {
//		List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
////		System.out.println(myList);
//		Iterator myList1 = myList.iterator();
		List<String> myString = new ArrayList<>(Arrays.asList("Dog","Cat","Bat"));
		Iterator<String> myString1 = myString.iterator();
		while(myString1.hasNext()==true) {
			if(myString1.next().endsWith("at")) {
				myString1.remove();
			}
			System.out.println(myString); 
		}
		
	}

}
