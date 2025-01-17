package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class removeElementIterator {
	public static void main(String[] args) {
//		List<String> myList = List.of("Dat","Cat","Tat","Sat","Minh");
/*
 * Explanation : Khi su dung for_loop, chuong trinh Java van sai 1 trinh ngam de quan li la trinh iterator 
 * Neu xoa bang for-each thi xung dot voi iterator ngam cua chuong trinh Java
 */
		List<String> myList = new ArrayList<String>(List.of("Dat","Cat","Tat","Sat","Minh"));
//		for(String myListWord:myList) {
//			if(myListWord.endsWith("at")==true) {
//				myList.remove(myListWord);
//			}
//		}
		Iterator<String> myListWord = myList.iterator();
		while(myListWord.hasNext()) {
			if(( myListWord.next()).endsWith("at")) {
				myList.remove(myListWord);
			}
		}
		System.out.println(myList);
	}

}
