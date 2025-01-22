package intermediateOP;

import java.util.List;

public class iOP4 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(23,5645,546,323,12,767,33443);
		System.out.println(myList);
		myList.stream().distinct().sorted().forEach(e->System.out.println(e));
		myList.stream().sorted().distinct().forEach(e->System.out.println(e));
		myList.stream().sorted().forEach(e->System.out.println(e));
	}

}
