package hof;

import java.util.List;
import java.util.function.Predicate;

public class hof7 {
	public static void main(String[] args) {
		List<String> hof7 = List.of("Dat","Cat","Tat","Sat","Deck","Sex","Linh");
		List<String> hof7Predicate = atCharacterFilter(hof7, e->e.endsWith("inh"));
		System.out.println(hof7Predicate);
	}
	public static List<String> atCharacterFilter(List<String> myList, Predicate<String> conditions){
		return myList.stream().filter(conditions).toList();
	}
	

}
