package com.functionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner1 {
	public static void printing(List<String> list) {
		for(String stringList : list) {
			System.out.println(stringList);
		}
	}
	public static void printingwithFP(List<String> list) {
		list.stream().forEach(cc -> System.out.println(cc));
	}
	public static void main(String[] args) {
		List<String> myList = List.of("DangNhatMinh","NguyenDucChung","HuynhThaoLinh","VoThiBachDuong");
//		printing(myList);
		printingwithFP(myList);
	}

}
