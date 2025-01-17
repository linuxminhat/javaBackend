package list;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing3 {
	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<Integer>(List.of(1,2,3,4,5,100));
		System.out.println(myList);
//		myList.remove(100);
//		myList.remove(100);
		myList.remove(Integer.valueOf(100));
		System.out.println(myList.remove(100));
	}

}
