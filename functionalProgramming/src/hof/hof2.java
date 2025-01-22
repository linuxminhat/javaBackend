package hof;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class hof2 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6);
		List<Integer> evens = filter(numbers, n -> n % 2 == 0);
		System.out.println(evens);
		System.out.println(hof2.SquareNumber().apply(100));
	}
	
	private static Function<Integer,Integer> SquareNumber(){
		return e->e*2;
	}
	private static List<Integer> filter(List<Integer> numbers, Predicate<Integer> condition) {
		// TODO Auto-generated method stub
		return numbers.stream()
                .filter(condition) // Áp dụng hành vi lọc
                .toList();
	}

 
}
