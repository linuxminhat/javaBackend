package list;

import java.util.ArrayList;
import java.util.List;

public class iteratingAdvanced1 {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>(List.of("Dang","Nhat","Minh"));
		System.out.println(myList);
		for(String arrayList:myList) {
			System.out.println(arrayList);
		}
	}

}
