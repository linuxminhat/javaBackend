package com.functionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner {
//	private static void printingBasic(List<String> stringList) {
//		for(String stringInList : stringList) {
//			System.out.println(stringInList);
//		}
//	}
	private static void printingwithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println("element"+ element));
	}
	public static void main(String[] args) {
		List<String> list = List.of("Apple","Banana","Cat");
		for(String listString : list) { 
			System.out.println(listString);
		}
//		printingBasic(list);
		printingwithFP(list);
	}

}
