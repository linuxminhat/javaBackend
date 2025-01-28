package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sorting {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(123,12,3,45);
		List<Integer> newNumbers = new ArrayList<>(numbers);
		System.out.println("newNumbers :" + newNumbers);
		Collections.sort(newNumbers);
		System.out.println(newNumbers);
		
	}

}
