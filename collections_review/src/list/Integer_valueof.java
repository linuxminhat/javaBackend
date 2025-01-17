package list;

import java.util.ArrayList;
import java.util.List;

public class Integer_valueof {
	public static void main(String[] args) {
		List<Integer> myList1 = List.of(1,2,3,4,5);
		ArrayList<Integer> myArrayList = new ArrayList<Integer>(myList1);
		System.out.println(myList1);
//		myList1.remove(Integer.valueOf(4));
//		System.out.println(myList1);
		myArrayList.remove(Integer.valueOf(4));//NOTE !!!
		System.out.println(myArrayList);
	}

}
