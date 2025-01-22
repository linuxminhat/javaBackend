package review;

import java.util.List;

public class fp1 {
	public static void printingWithFP(List<Integer> myList) {
		myList.stream().forEach(e->System.out.println(e));
	}
	public static void printingWithOdd(List<Integer> myList) {
		myList.stream().filter(e->e%2!=0).forEach(e->System.out.println(e));
	}
	public static void printingWithEven(List<Integer> myList) {
		myList.stream().filter(e->e%2==0).forEach(e->System.out.println(e));
	}
	public static int sumWithFP(List<Integer> myList) {
		return myList.stream().reduce(0,(number1,number2)->(number1+number2));
	}
	public static void sumWithEvenFP(List<Integer>myList) {
		System.out.println(myList.stream().filter(e->e%2==0).reduce(0, (number1,number2)->(number1+number2)));
	}
	public static void sumWithOddFP(List<Integer>myList) {
		System.out.println(myList.stream().filter(e->e%2!=1).reduce(0, (number1,number2)->(number1+number2)));
	}
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
		printingWithFP(myList);
		sumWithFP(myList);
		System.out.println(sumWithFP(myList));
		sumWithEvenFP(myList);
		sumWithOddFP(myList);
	}

}
