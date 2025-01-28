package list;

import java.util.ArrayList;
import java.util.List;

public class arrayList3 {
	public static void main(String[] args) {
		List<Integer> myList1 = List.of(1,2,3,4,5,6,7,8,9,10);
		List<Integer> myArrayList1 = new ArrayList<>(myList1);
		System.out.println(myArrayList1);
		System.out.println(myArrayList1.size());
		myArrayList1.remove(5);
		System.out.println(myArrayList1);
		System.out.println(myArrayList1);
		myArrayList1.add(200);
		System.out.println(myArrayList1);
		myArrayList1.add(10, 1000);
		System.out.println(myArrayList1);
	}

}
