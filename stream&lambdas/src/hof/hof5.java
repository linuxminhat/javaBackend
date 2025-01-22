package hof;

import java.util.List;
import java.util.function.Predicate;

public class hof5 {
	public static void main(String[] args) {
		List<Integer> hof5 = List.of(1,2,3,4,5,6,7,8,9,10);
		List<Integer> evenPredicate = evenFilter(hof5,e->e%2==0);
		System.out.println(evenPredicate);
	}
	public static List<Integer> evenFilter(List<Integer> myList, Predicate<Integer> conditions){
		return myList.stream().filter(conditions).toList();
	}

}
