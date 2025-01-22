package sumFP;

import java.util.List;

public class sumFP2 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
		int sum = myList.stream().reduce(0, (m,n)->(m+n));
		System.out.println(sum);
	}

}
