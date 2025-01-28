package com.functionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner3 {
	public static void printingWithFP(List<Integer> list) {
		list.stream().forEach(e -> System.out.println(e));
	}
	public static void main(String[] args) {
		List<Integer> myList = List.of();
		printingWithFP(myList);
	}
}
