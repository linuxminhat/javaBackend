package com.functionalProgramming;

import java.util.List;

public class FPNumberRunner3_Sort {
	public static void fpFunctionwithSort(List<Integer> myList) {
		myList.stream().sorted().forEach(e -> System.out.print(" " + e));
	}
	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,454,1,6564,3231,2,9,8);
		fpFunctionwithSort(list);
		
	}

}
