package streams;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class fInterfaces3 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
		System.out.println(myList);
		myList.stream().map(e->e*e).collect(Collectors.toList()).forEach(e->System.out.println(e));
		Function<Integer,Integer> squareNumber = e->e*e;
		myList.stream().map(squareNumber).collect(Collectors.toList()).forEach(e->System.out.println(e));
		
	}

}
