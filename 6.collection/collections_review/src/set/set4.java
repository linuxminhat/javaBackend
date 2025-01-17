package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class set4 {
	public static void main(String[] args) {
		List<Character> characters = List.of('A','Z','A','B','Z','F');
		//In ra kí tự duy nhất 
		Set<List<Character>> setCharacters = Set.of(characters);
		System.out.println(setCharacters);
		HashSet<Character> hashSetCharacters = new HashSet<Character>(characters);
		System.out.println(hashSetCharacters);
		LinkedHashSet<Character> linkedHashSetCharacters = new LinkedHashSet<Character>(characters);
		System.out.println(linkedHashSetCharacters);
		TreeSet<Character> treeSetCharacters = new TreeSet<Character>(characters);
		System.out.println(treeSetCharacters);
	}
}
