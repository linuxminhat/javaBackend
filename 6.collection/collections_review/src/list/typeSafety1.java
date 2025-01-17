package list;

import java.util.ArrayList;
import java.util.List;

public class typeSafety1 {
	public static void main(String[] args) {
		List value = List.of("A",'A',1,1.0);
		System.out.println(value);
		System.out.println(value.get(2));
		System.out.println(value.get(2) instanceof Integer);
		ArrayList<String> myArrayList = new ArrayList<String>(List.of("Dang","Nang","Thang","Sang"));
		System.out.println(myArrayList);
		System.out.println(myArrayList.get(2));
//		System.out.println(myArrayList.get(3) instanceof Integer); Java khong cho phep kiem tra instanceof voi kieu khong tuong thich
		
	}

}
