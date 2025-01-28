package list;

import java.util.ArrayList;
import java.util.List;

public class list_howtoremove {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>(List.of("Dang","Nhat","Minh"));
		myList.remove(0);
		System.out.println(myList);
		myList.remove("Nhat");
		System.out.println(myList);
	}

}
