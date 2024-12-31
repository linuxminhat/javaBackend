package com.functionalProgramming;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FPNumberRunner_findingMinNumber {
	public static void printingSquareOfTenNumber(List<Integer> list) {
		list.stream().map(e -> e*e).forEach(e -> System.out.println(e));
	}
	public static void printingListSquareOfTenNumber(List<Integer> list) {
		list.stream().map(e -> e*e).collect(Collectors.toList()).forEach(e -> System.out.println(e));
	}
	public static List<Integer> printingMultipleOf3(List<Integer> list){
		return list.stream().filter(e -> e%3==0).collect(Collectors.toList());
	}
	public static List<Integer> printingListOfEvenNumber(List<Integer> list){
		return list.stream().filter(e -> e%2 ==0).collect(Collectors.toList());
	}
	public static void printingOddNumber(List<Integer> list) {
		list.stream().filter(e -> e%2!=0).forEach(e -> System.out.println(e));
	}
	public static Optional<Integer> findingMinNumber(List<Integer> list) {
		return list.stream().min((n1,n2) -> Integer.compare(n1, n2));
	}
	public static List<Integer> printingListOfOddNumber(List<Integer> list){
		return list.stream().filter(e -> e%2!=0).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
//		System.out.println(findingMinNumber(myList));
//		printingOddNumber(myList);
//		printingListOfOddNumber(myList);
//		System.out.println(printingListOfOddNumber(myList));
//		System.out.println(printingListOfEvenNumber(myList));
//		System.out.println(printingMultipleOf3(myList));
//		printingSquareOfTenNumber(myList);
		printingListSquareOfTenNumber(myList);
	}

}
