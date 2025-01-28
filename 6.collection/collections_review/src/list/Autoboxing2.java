package list;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing2 {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>(List.of(1,2,3,4,5));
		for(Integer myListNumb:myList) {
			if(myListNumb==2) {
				myList.remove(myListNumb);
			}
		}
	}
}
