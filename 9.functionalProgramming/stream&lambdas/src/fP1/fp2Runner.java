package fP1;

import java.util.List;

public class fp2Runner {
	public static void main(String[] args) {
		List<String> myList = List.of("DangNhatMinh","NguyenDucChung","TranLeMinh");
		printingWithFP(myList);
	}
	public static void printingWithoutFP(List<String> myList) {
		for(String element:myList) {
			System.out.println(element);
		}
	}
	public static void printingWithFP(List<String> myList) {
		myList.stream().forEach(element -> System.out.println(element));
	}

}
