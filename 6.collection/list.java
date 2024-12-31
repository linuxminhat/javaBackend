package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class list {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		System.out.println(myList);
		myList.add(9, 10);
		System.out.println(myList);
		myList.add(199);
		System.out.println(myList);
		List<Integer> myVector1 = new Vector<>(Arrays.asList(101,102,103,104));
		myList.addAll(myVector1);
		System.out.println(myList);
		System.out.println(myList.isEmpty());
		System.out.println(myList.contains(10000));
	}

}
