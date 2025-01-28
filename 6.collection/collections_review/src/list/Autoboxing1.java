package list;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing1 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
		System.out.println(myList);
//		List<String> myList1 = List.of("Dang","Nhat","Minh",1); => Error 
		System.out.println(myList.indexOf(10));
		List<Integer> myList2 = new ArrayList<Integer>(myList);
		System.out.println(myList2);
		System.out.println(myList2.indexOf(2));
		myList.remove(1);
		System.out.println(myList);
		
	}

}

