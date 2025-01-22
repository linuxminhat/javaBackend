package methodRef;

import java.util.List;

public class methodRef1 {
	public static void main(String[] args) {
		List<String> myList = List.of("DangNhatMinh","NguyenDucChung","TranLeMinh");
		myList.stream().map(String::length).forEach(System.out::println);
	}

}
