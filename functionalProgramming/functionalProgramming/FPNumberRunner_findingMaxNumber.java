package com.functionalProgramming;

import java.util.List;
import java.util.Optional;

public class FPNumberRunner_findingMaxNumber {
	public static Optional<Integer> findingMaxNumber(List<Integer> list) {
		return list.stream().max((n1,n2)->Integer.compare(n1, n2));
	}
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
		System.out.println(findingMaxNumber(myList));
	}

}
 