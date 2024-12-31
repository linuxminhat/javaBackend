package Collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class challenge1 {
	static List<Character> myChars = List.of('A','Z','A','B','Z','F');
	public static void main(String[] args) {
		System.out.println("myChars : " + myChars);
		Set<Character> mySet = new HashSet<>(myChars);
		System.out.println(mySet);
		
	}
}
