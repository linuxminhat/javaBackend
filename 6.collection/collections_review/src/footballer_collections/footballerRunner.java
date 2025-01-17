package footballer_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class footballerRunner {
	public static void main(String[] args) {
		ArrayList<footballer> footballerList = new ArrayList<footballer>(List.of(new footballer(8,"Messi","Barca"),
				new footballer(5,"Ronaldo","Real"),
				new footballer(100,"NhatMinh","Barca")));
		System.out.println(footballerList);
		Collections.sort((List<footballer>)footballerList);
		System.out.println(footballerList);

	}
}
