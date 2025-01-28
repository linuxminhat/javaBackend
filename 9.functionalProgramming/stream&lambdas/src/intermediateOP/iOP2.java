package intermediateOP;

import java.util.List;

public class iOP2 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,56523,213,767,3,2323,65675,3,1);
		myList.stream().distinct().forEach(e->System.out.print(e));
		System.out.println();
		myList.stream().sorted().forEach(e->System.out.print(e));
		System.out.println();
		myList.stream().distinct().sorted().forEach(e->System.out.print(e));
	}

}
