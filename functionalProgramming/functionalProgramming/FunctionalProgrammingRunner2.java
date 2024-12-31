package com.functionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner2 {
	public static void printingwithFP(List<Integer> list) {
		list.stream().forEach(elements -> System.out.println(elements));
	}
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5);
		printingwithFP(myList);
	}
}
