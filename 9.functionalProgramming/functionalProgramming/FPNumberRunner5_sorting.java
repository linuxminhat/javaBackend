package com.functionalProgramming;

import java.util.List;

public class FPNumberRunner5_sorting {
	public static void fpNumberwithDistinct(List<Integer> list) {
		list.stream().distinct().forEach(e -> System.out.println(e));
	}
	public static void fpNumberwithSort(List<Integer> list) {
		list.stream().sorted().forEach(e -> System.out.println(e));
	}
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,65,75,232);
//		fpNumberwithSort(myList);
		List<Integer> myList1 = List.of(1,1,1,23,5,232,556);
		fpNumberwithDistinct(myList1);
	}

}
