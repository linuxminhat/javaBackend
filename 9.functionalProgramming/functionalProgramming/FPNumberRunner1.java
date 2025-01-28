package com.functionalProgramming;

import java.util.List;

public class FPNumberRunner1 {
	public static Integer sumwithFP(List<Integer> list) {
		return list.stream().reduce(0,(e1,e2) -> (e1+e2));
	}
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5);
		sumwithFP(myList);
		System.out.println(sumwithFP(myList));
		
	}
}
