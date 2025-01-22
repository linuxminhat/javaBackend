package streams;

import java.util.List;

public class fp1 {
	public static void printing(Integer myStringList) {
		System.out.println(myStringList);
	}
	public static void main(String[] args) {
		List<Integer> myStringList = List.of(1,2,3,4,5,6,7,8,9,10);
		myStringList.stream().forEach(fp1::printing);
		//Dung phuong thuc printing cua lop fp1
	}

}
