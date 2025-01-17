package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sorting1 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,2323,4,5);
		ArrayList<Integer> myArrayList = new ArrayList<Integer>(myList);
		Collections.sort(myArrayList);
		System.out.println(myArrayList);
	}

}
