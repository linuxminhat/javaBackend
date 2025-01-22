package hof;

import java.util.List;
import java.util.function.Predicate;

public class hof8 {
	public static void main(String[] args) {
		List<String> myList = List.of("DangNhatMinh","NguyenDucChung","TranLeMinh");
		List<String> inhCharacterPredicate = inhCharacterFilter(myList,e->e.endsWith("inh"));
		System.out.println(inhCharacterPredicate);
	}
	public static List<String> inhCharacterFilter(List<String> myList, Predicate<String> conditions) {
		return myList.stream().filter(conditions).toList();
	}

}
