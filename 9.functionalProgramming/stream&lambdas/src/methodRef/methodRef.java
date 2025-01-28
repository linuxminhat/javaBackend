package methodRef;

import java.util.List;

public class methodRef {
	/*
	 * tinh nang trong Java8
	 * cung cap cach ngan gon va de doc de tham chieu phuong thuc hoac constructor lop hay doi tuong
	 * khong can goi truc tiep 
	 */
	public static void main(String[] args) {
		List<String> myList = List.of("At","Cat","Bat","Chat","Lat","That");
//		myList.stream().map(e->e.length()).forEach(e->System.out.println(e));
//		myList.stream().map(e->e.length()).forEach(System.out::println);
		myList.stream().map(String::length).forEach(System.out::println);
		List<Integer> myList1 = List.of(23,45,67,34);
		 
	}

}
