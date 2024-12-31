package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List2 {
	public static void main(String[] args) {
		List<String> word = new ArrayList<>(Arrays.asList("Dog","Cat","Tom"));
		System.out.println(word);
		List<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		System.out.println(number);
		System.out.println(word.size());
		System.out.println(word.isEmpty());
		List<Boolean> bool = List.of(true,false,true,true);
		System.out.println(bool);
		System.out.println(bool.contains("!"));
		List<Integer> newWord = new ArrayList<>(Arrays.asList(1,2,3,43,5,6,7));
		System.out.println(newWord.isEmpty());
		System.out.println(newWord.add(5));
		System.out.println(newWord);
		List<Integer> oldWord = List.of(1,2,3,4,5,6,7,8,9);
		System.out.println(oldWord);
		
		
	}

}
