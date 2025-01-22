package terminalOP;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class terminalOP4 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
		System.out.println(myList);
		myList.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(myList.stream().filter(e->e%2==0).collect(Collectors.toList()));
		myList.stream().filter(e->e%2==0).map(e->e*e).collect(Collectors.toList());
		System.out.println(myList.stream().filter(e->e%2==0).map(e->e*e).collect(Collectors.toList()));
		System.out.println(IntStream.range(1, 11).map(e->e*e).boxed().collect(Collectors.toList()));
	}

}
