package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class iterator {
	public static void main(String[] args) {
		List<Integer> myList1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<Integer> myList2 = new LinkedList<>(Arrays.asList(6,7,8,9,10));
		List<Integer> myList3 = new Vector<>(Arrays.asList(11,12,13,14,15,16));
		myList2.addAll(myList3);
		myList1.addAll(myList2);
//		System.out.println(myList1);
		//Iterator 
		//Loop 
//		for(int i=0;i<myList1.size();i++) {
////			System.out.println(myList1.get(i));
////		}
		//Advanced loop
//		for(int number : myList1) {
//			System.out.println(number);
//		}
		//Iterator 
		Iterator number = myList1.iterator();
		while(number.hasNext()==true) {
			System.out.println(number.next());
		}
		
	}
}
