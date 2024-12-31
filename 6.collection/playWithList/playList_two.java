package playWithList;

import java.util.ArrayList;
import java.util.List;

public class playList_two {
	public static void main(String[] args) {
		List<String> myWord = new ArrayList<>(List.of("Dang","Nhat","Minh"));
		myWord.add("Huynh Thao Linh");
		System.out.println(myWord);
	}

}
