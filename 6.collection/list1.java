package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list1 {
    public static void main(String[] args) {
        List<String> word = new ArrayList<>(Arrays.asList("Dog"));
        System.out.println(word);
        
        // Nếu bạn đang sử dụng Java 9 hoặc cao hơn, bạn có thể sử dụng List.of
        List<String> word1 = List.of("Dog", "Cat", "Bird");
        System.out.println(word1);
        List<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(number);
        List<Integer> number1 = List.of(1,2,3,4);
        System.out.println(number1);
        System.out.println(word1.size());
        System.out.println(number1.size());
        System.out.println(word1.isEmpty());
        System.out.println(word1.get(0));
        System.out.println(word1.contains("Dog"));
    }
}
