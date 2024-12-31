package com.functionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner4 {
	public static void printingUppercase(List<Character> list) {
		list.stream().filter(e -> e>=65 && e<=90).forEach(e -> System.out.println(e));
	}
	public static void printingNumberwithFP(List<Integer> list) {
		list.stream().filter(element -> element%2==0).forEach(element -> System.out.println(element));
	}
	public static void printingWithFP(List<String> list) {
		list.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println(element));
	}
	public static void main(String[] args) {
		List<String> myList = List.of("DangNhatMinhCat","ChungBat","LinhMat","Dang");
		printingWithFP(myList);
		List<Integer> myList1 = List.of(1,2,4,232,46,13,35,37);
		printingNumberwithFP(myList1);
		List<Character> myList2 = List.of('D','A','N','G','M','G','M','f','p','t');
		printingUppercase(myList2);
	}

}
