package streams;

import java.util.List;
import java.util.function.Predicate;

public class fInterfaces {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		Predicate<? super Integer> isEvenPredicate = x->x%2==0;
		Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
			public boolean test(Integer x) {
				return x%2==0;
			}
		};
		numbers.stream().filter(isEvenPredicate).forEach(e->System.out.println(e));
	}
	

}
