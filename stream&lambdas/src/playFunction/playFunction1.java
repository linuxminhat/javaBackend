package playFunction;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class playFunction1 {
	private static Predicate<Integer> createEvenPredicate() {
	    return n -> n % 2 == 0;
	}
	public static void main(String[] args) {
		List<String> myList = List.of("DangNhatMinh","NguyenDucChung","TranLeMinh");
		System.out.print(myList);
		System.out.println();
		System.out.println(myList.stream().collect(Collectors.toList()));
		List<Integer> myList1 = List.of(23,43,34,45,36,48);
		myList1.stream().filter(e->e%2==0).map(e->e*e).forEach(e->System.out.println(e));
		// Storing functions in variable
		//Filtering
		Predicate<? super Integer> evenPredicate = n -> n%2==0;
		Predicate<? super Integer> oddPredicate = n -> n%2 !=0;
		//Returning functions
		

	}

}
