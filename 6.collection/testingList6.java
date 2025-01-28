package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testingList6 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(123,12,3,45);
		List<Integer> numbersAI = new ArrayList<>(numbers);
//		numbersAI.sort(numbers);
		Collections.sort(numbers);
		System.out.println(numbersAI);
		
	}

}
