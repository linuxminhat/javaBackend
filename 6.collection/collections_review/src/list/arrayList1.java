package list;

import java.util.ArrayList;
import java.util.List;

public class arrayList1 {
	public static void main(String[] args) {
		List<String> myList = List.of("Dang","Nhat","Minh");
		List<String> myArrayList = new ArrayList<String>(myList);
		System.out.println(myArrayList);
		ArrayList<String> myArrayList1 = new ArrayList<String>();
		List<String> myList1 = new ArrayList<String>(List.of());
		
	}

}
