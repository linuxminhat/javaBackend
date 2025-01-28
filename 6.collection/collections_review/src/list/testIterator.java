package list;

import java.util.List;

public class testIterator {
	public static void main(String[] args) {
		List<String> myList = List.of("Cat","Bat","Sat","CC");
		for(String myListWord:myList) {
			if(myListWord.endsWith("at")==true) {
				System.out.println(myListWord);
			}
		}
		
	}
}
