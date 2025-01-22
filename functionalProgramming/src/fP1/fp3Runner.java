package fP1;

import java.util.List;

public class fp3Runner {
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5);
		sumWithoutFP(myList);
		
	}
	public static void sumWithoutFP(List<Integer> myList) {
		int sum=0;
		for(Integer element:myList) {
			sum+=element;
		}
		System.out.println(sum);
		
	}
//	public static void sumWithFP(List<Integer> myList) {
//		myList.stream().forEach(element -> +=element);
//	}
	

}
