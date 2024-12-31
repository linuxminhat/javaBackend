package functionalProgramming_exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgramming_Printing {
	//In ra n mu 2 cua n so dau tien
	public static List<Integer> printing1(int n){
		return IntStream.range(1, n+1).map(numb->numb*numb).boxed().collect(Collectors.toList());
	}
	public static List<Integer> printing2(int n){
		return IntStream.range(1, n+1).map(number->number*number*number).boxed().collect(Collectors.toList());
	}
	public static List<Integer> printing3(int n){
		return IntStream.range(1, n+1).map(number->number*number*number*number).boxed().collect(Collectors.toList());
	}

}
