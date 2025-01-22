package hof;

import java.util.List;
import java.util.function.Predicate;

public class hof6 {
	public static void main(String[] args) {
		List<String> hof6 = List.of("Cat","Tat","That","Sat","Deck","Table");
		List<String> atCharacterAtEnd = atFilter(hof6,e->e.endsWith("at"));
		System.out.println(atCharacterAtEnd);
	}
	public static List<String> atFilter(List<String> myList, Predicate<String> conditions){
		return myList.stream().filter(conditions).toList();
	}

}
