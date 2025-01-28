package playWithList;

import java.util.List;
import java.util.Vector;

public class playList_three_vectortesting {
	public static void main(String[] args) {
		List<String> beforemyWord = new Vector<>(List.of("My","Kind","Of","Woman"));
		System.out.println(beforemyWord);
		Vector<String> aftermyWord = new Vector<>(beforemyWord);
		
		aftermyWord.add("He he he he he ");
		System.out.println(aftermyWord);
	}

}
