package list;

import java.util.List;

public class list1 {
	/*
	 * Tap hop co thu tu 
	 * Cho phep trung lap 
	 * Ho tro truy cap theo chi so 
	 */
	public static void main(String[] args) {
		List<String> myList = List.of("Apple","Banana","Mango");
		System.out.println(myList);
//		System.out.println(myList.length()); : Wrong 
		System.out.println(myList.size());
		System.out.println(myList.isEmpty());
		System.out.println(myList.get(0));
		System.out.println(myList.contains("Minh"));
	}
}
