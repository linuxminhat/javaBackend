package list;

import java.util.LinkedList;
import java.util.List;

public class iteratingAroundElements2 {
	public static void main(String[] args) {
		LinkedList<String> myLinkedList = new LinkedList<String>(List.of("Dang","Nhat","Minh"));
		for(int i=0;i<myLinkedList.size();i++) {
			System.out.println(myLinkedList.get(i));
		}
		 
	}

}
