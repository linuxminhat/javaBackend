package com.functionalProgramming;

import java.util.List;

public class FPNumberRunner6_printingSquare {
	public static void printingSquareofTen(List<Integer> list) {
		list.stream().map(e -> e*e).forEach(e -> System.out.println(e));
	}
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
		printingSquareofTen(myList);
	}

}
