package com.functionalProgramming;

import java.util.List;

public class MethodReferencesRunner {
	public static void printing(Integer str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
//		 List.of("Ant","Bat","Cat","Dog","Elephant").stream().map(e -> e.length()).forEach(e->System.out.println(e));
		 List.of("Ant","Bat","Cat","Dog","Elephant").stream().map(e -> e.length()).forEach(System.out::println);
		 List.of("Ant","Bat","Cat","Dog","Element").stream().map(e->e.length()).forEach(MethodReferencesRunner::printing);
		 
	}

}
