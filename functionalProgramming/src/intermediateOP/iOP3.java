package intermediateOP;

import java.util.List;

public class iOP3 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(23,6,1312,767,2121,43453,89,33,600);
		System.out.println(myList);
		myList.stream().distinct().forEach(e->System.out.println(e));
		System.out.println();
		myList.stream().distinct().sorted().forEach(e->System.out.println(e));
		System.out.println();
		myList.stream().sorted().forEach(e->System.out.println(e));
		
	}

}
