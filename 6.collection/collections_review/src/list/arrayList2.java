package list;

import java.util.ArrayList;
import java.util.List;

public class arrayList2 {
	public static void main(String[] args) {
		List<Integer> myList1 = List.of(1,2,23,4,5,5);
		List<Integer> myList2 = new ArrayList<>(myList1);
		System.out.println(myList2);
		myList2.add(100);
		System.out.println(myList2);
		myList2.add(1, 1000);
		System.out.println(myList2);
	}

}
