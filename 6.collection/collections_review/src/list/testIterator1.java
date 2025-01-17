package list;

import java.util.List;

public class testIterator1 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
		for (Integer myListNumb:myList) {
			if(myListNumb%2==0) {
				System.out.println(myListNumb);
			}
		}
	}

}
