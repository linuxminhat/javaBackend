package sumFP;

import java.util.List;

public class sumFP3 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
//		myList.stream().reduce(0,(e,n)->(e+n));
		System.out.println(myList.stream().reduce(0,(e,n)->(e+n)));
	}

}
