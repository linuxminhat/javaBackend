package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class testingList7 {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>(Arrays.asList(1029,23,99,1,121,122,28));
		System.out.println(myList);
		Collections.sort(myList);
		System.out.println(myList);
	}

}
