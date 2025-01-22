package filteringFP;

import java.util.List;

public class filteringFP1 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
		printingWithFP(myList);		
	}
	public static void printingWithFP(List<Integer> myList) {
		myList.stream().filter(e -> e%2 == 0).forEach(e -> System.out.println(e));
	}

}
