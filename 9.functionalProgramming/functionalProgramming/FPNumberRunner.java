package com.functionalProgramming;

import java.util.List;

public class FPNumberRunner {
	 public static void main(String[] args) {
		List<Integer> numbers = List.of(4,6,8,5232,12);
		numbers.stream().forEach(e -> System.out.println(e));
		numbers.stream().reduce(0, (n1,n2) -> (n1+n2));
		numbers.stream().reduce(0,(n1,n2)->(n1*n2));
		
	}

}
