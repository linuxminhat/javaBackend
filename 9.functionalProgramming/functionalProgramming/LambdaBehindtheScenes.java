package com.functionalProgramming;

import java.util.List;

public class LambdaBehindtheScenes {
	public static void main(String[] args) {
		List<Integer> myList = List.of(23,43,34,45);
		myList.stream().forEach(e -> System.out::println(e););
		
	}

}
