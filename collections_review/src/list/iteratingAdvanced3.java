package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratingAdvanced3 {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>(List.of("Dang","Nhat","Minh"));
		System.out.println(myList);
		Iterator<String> myListIterator = myList.iterator();
		while(myListIterator.hasNext()==true) {
			if(myListIterator.next().endsWith("inh")==true) {
				myListIterator.remove();
			}
		}
		System.out.println(myList);
	}

}
