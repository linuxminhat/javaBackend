package list;

import java.util.List;

public class list2 {
	public static void main(String[] args) {
		List<String> myList = List.of("Chung","NhatMinh","LeMinh","ThaoLinh");
		System.out.println(myList.size());
//		myList.add("BachDuong"); => Immmutable 
		System.out.println(myList);
		
	}

}
