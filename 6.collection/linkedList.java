package Collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class linkedList {
	public static void main(String[] args) {
		List<Integer> myList = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8));
		System.out.println(myList);
		myList.add(10000);
		myList.add(100000000);
		System.out.println(myList);
	}

}
