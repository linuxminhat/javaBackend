package com.functionalProgramming;

import java.util.List;
import java.util.Optional;

public class FPNumberRunners_review {
	public static Optional<Integer> findingMaxNumber(List<Integer> list) {
		return list.stream().max((n1,n2)->Integer.compare(n1, n2));
	}
	public static void printingOddNumber(List<Integer> list) {
		list.stream().filter(e -> e%2!=0).forEach(e -> System.out.print(e));
		System.out.println(" ");
	}
	public static void printingEvenNumber(List<Integer> list) {
		list.stream().filter(e->e%2==0).forEach(e->System.out.print(e));
		System.out.println(" ");
	}
	public static Integer sumOfElement(List<Integer> list) {
		return list.stream().reduce(0,(n1,n2)->(n1+n2));
	}
	public static Integer productOfElement(List<Integer> list) {
		return list.stream().reduce(1,(e1,e2)->(e1*e2));
	}
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
		printingOddNumber(myList);
		printingEvenNumber(myList);
		sumOfElement(myList);
		System.out.println(sumOfElement(myList));
		System.out.println(productOfElement(myList));
	}

}
