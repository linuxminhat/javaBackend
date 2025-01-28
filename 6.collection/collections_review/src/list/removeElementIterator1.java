package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class removeElementIterator1 {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>(List.of("Dat","Cat","Sat","Minh","Linh"));
		Iterator<String> myListIterator = myList.iterator();
		while(myListIterator.hasNext()) {
			if(myListIterator.next().endsWith("at")) {
				myListIterator.remove();//Goi remove bang Iterator truc tiep luon 
			}
		}
		System.out.println(myList);
	}

}
