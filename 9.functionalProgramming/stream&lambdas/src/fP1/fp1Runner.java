package fP1;

import java.util.List;

public class fp1Runner {
	public static void main(String[] args) {
		List<String> list = List.of("Apple","Banana","Watermelon");
		for(String string:list) {
			System.out.println(string);
			
		}
		printWithFP(list);
	}
	public static void printBasic(List<String> list) {
		for(String string:list) {
			System.out.println(string);
		}
	}
	public static void printWithFP(List<String> list) {
		//element -> System.out.println(element) : lamda expression
		//Chuyển phương thức thành đối số
		list.stream().forEach(element -> System.out.println(element));
	}

}
