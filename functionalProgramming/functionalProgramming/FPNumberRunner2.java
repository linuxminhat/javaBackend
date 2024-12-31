package com.functionalProgramming;

import java.util.List;

public class FPNumberRunner2 {
	public static Integer sumEvenNumberwithFP(List<Integer> list) {
		return list.stream().filter(n -> n%2 ==0).reduce(0, (n1,n2) -> (n1+n2));
	}
	public static Integer sumOddNumberwithFP(List<Integer> list) {
		return list.stream().filter(numb -> numb%2!=0).reduce(0, (numb1,numb2) -> (numb1 + numb2));
	}
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
		sumOddNumberwithFP(myList);
		System.out.println(sumOddNumberwithFP(myList));
	}

}
