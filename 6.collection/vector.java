package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class vector {
	public static void main(String[] args) {
		List<Integer> myVector = new Vector<>(Arrays.asList(1,2,3,4,5,6));
		System.out.println(myVector);
		myVector.add(7);
		myVector.add(0,10);
		System.out.println(myVector);
		List<Integer> myList = new ArrayList<>(Arrays.asList(100,101,102,103));
		myVector.addAll(myList);
		System.out.println(myVector);
		myVector.set(2, 10);
		System.out.println(myVector);
		myVector.remove(3);
		System.out.println(myVector);
		myVector.remove(2810);
		System.out.println(myVector);
	}

}
