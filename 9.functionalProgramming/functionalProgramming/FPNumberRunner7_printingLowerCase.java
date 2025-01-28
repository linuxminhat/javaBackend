package com.functionalProgramming;

import java.util.List;

public class FPNumberRunner7_printingLowerCase {
	public static void printingLowerCase(List<String> list) {
		list.stream().map(c -> c.toLowerCase()).forEach(e -> System.out.println(e));
	}
	public static void main(String[] args) {
		List<String> myString = List.of("dANG");
		printingLowerCase(myString);
	}

}
