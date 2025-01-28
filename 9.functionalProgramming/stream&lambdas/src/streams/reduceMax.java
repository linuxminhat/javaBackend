package streams;

import java.util.List;

public class reduceMax {
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
		myList.stream().forEach(e->System.out.println(e));
		int maxValue = myList.stream().reduce(0, (x,y)->(x>y?x:y));
		System.out.println(maxValue);
		int minValue = myList.stream().reduce(0, (x,y)->(x>y?y:x));
		System.out.println(minValue);

	}

}
