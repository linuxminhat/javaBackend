package intermediateOP;

import java.util.List;

public class iOP5 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(4,6,8,3,13,15);
		numbers.stream().map(e->e*e).forEach(e->System.out.print(e));
		List<String> myString = List.of("Apple","Ant","Bat");
		System.out.println();
		myString.stream().map(e->e.toLowerCase()).forEach(e->System.out.print(e + " "));
		System.out.println();
		myString.stream().map(e->e.toUpperCase()).forEach(e->System.out.print(e+" "));
//		myString.stream().forEach(e->System.out.println(e.length()));
	}

}
