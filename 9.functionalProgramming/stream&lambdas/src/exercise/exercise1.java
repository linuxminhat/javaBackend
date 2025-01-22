package exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class exercise1 {
	public static List<Integer> filterOddNumbers(List<Integer> numbers) {
		return numbers.stream().filter(e->e%2!=0).collect(Collectors.toList());
    }
	public static List<Integer> getCubesOfFirstNNumbers(int n) {
		return IntStream.range(1, n+1).map(e->e*e*e).boxed().collect(Collectors.toList());
		
    }
	public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
        return courses.stream().map(e->e.length()).collect(Collectors.toList());
    }
	public static long sumOfSquares(List<Integer> numbers) {
        if(numbers==null) {
        	return 0;
        }else {
        	return numbers.stream().map(e->e*e).reduce(0, (numb1,numb2)->(numb1+numb2));
        }
    }
	public static int findMaxEvenNumber(List<Integer> numbers) {
        // Write your code here
		if (numbers == null || numbers.isEmpty()) {
            return 0;  
        }
		if(numbers.stream().filter(e->e%2!=0).toList()==null) {
			return 0;
		}
		return numbers.stream().filter(e->e%2==0).max((e1,e2)->Integer.compare(e1, e2)).get();
    }

}
