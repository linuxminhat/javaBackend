package functionalProgramming_exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgrammingMagic1 {
	public static List<Integer> getCubesOfFirstNNumbers(int n) {
		return IntStream.range(1, n+1).map(numb->numb*numb*numb).boxed().collect(Collectors.toList());
    }

}
