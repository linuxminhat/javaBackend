package list;

import java.util.LinkedList;
import java.util.List;

public class iteratingAdvanced2 {
	public static void main(String[] args) {
		List<String> myList = new LinkedList<String>(List.of("Huynh","Thao","Linh"));
		for(String linkedlist:myList) {
			System.out.println(linkedlist);
		}
	}
}
