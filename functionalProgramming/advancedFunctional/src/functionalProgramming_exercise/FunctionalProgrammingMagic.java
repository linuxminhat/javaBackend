package functionalProgramming_exercise;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgrammingMagic {
public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        
       return numbers.stream().filter(e->e%2!=0).collect(Collectors.toList());
        
    }

}
