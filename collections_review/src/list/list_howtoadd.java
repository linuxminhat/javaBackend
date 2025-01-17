package list;

import java.util.ArrayList;
import java.util.List;

public class list_howtoadd {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>(List.of("Dang","Nhat","Minh"));
		myList.add("Linh");
		System.out.println(myList);
		myList.add(2, "Thao");
		System.out.println(myList);
		List<String> previousList = List.of("Chung");
		myList.addAll(previousList);
		System.out.println(myList);
			
		
	}

}
