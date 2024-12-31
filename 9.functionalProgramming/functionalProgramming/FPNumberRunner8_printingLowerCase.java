package com.functionalProgramming;

import java.util.List;

public class FPNumberRunner8_printingLowerCase {
	public static void printingLowerCase(List<String> list) {
		list.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));
	}
	public static void main(String[] args) {
		List<String> myList = List.of("DangNHATminh");
		printingLowerCase(myList);
	}

}
