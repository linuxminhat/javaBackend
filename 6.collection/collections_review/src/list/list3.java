package list;

import java.util.List;

public class list3 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
		System.out.println(myList.size());
//		myList.add(100); => Immutable
		System.out.println(myList.size());
		myList.indexOf(10);
		System.out.println(myList.indexOf(9));
	}
}
