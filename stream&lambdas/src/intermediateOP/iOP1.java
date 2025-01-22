package intermediateOP;

import java.util.List;

public class iOP1 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(43,11,87,3,876,334,12,13467);
		//sorted
		myList.stream().sorted().forEach(e->System.out.println(e));
		myList.stream().distinct().sorted().forEach(e->System.out.println(e));
		
	}

}
