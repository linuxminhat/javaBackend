package streams;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class fInterfaces1 {
	public static <A, R> void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
		System.out.println(myList);
		//Square it => List it 
		myList.stream().map(e->e*e).collect(Collectors.toList()).forEach(e->System.out.print(e + " "));
		System.out.println();
		Function<Integer,Integer> squareMapping = e->e*e;
		myList.stream().map(squareMapping).collect(Collectors.toList()).forEach(System.out::print);
		
		
	}

}
