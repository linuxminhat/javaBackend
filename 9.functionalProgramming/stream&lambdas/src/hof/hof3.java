package hof;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class hof3 {
	public static void main(String[] args) {
		List<Integer> hof33 = List.of(1,2,3,4,5);
		List<Integer> evens = filter(hof33, e->e%2==0);//filter nhan e->e%2==0 lam tham so 
		System.out.println(evens);
		System.out.println(hof3.SquareNumber().apply(28));
		//		System.out.println(hof3.SquareNumber().get(28));
	}
	public static List<Integer> filter(List<Integer> list, Predicate<Integer> condition){
		return list.stream().filter(condition).toList();
			
	}
	public static Function<Integer,Integer> SquareNumber(){
		return e->e*e;
	}
	

}
