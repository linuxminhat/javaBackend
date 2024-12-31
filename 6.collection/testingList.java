package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testingList {
	public static void main(String[] args) {
		List value = List.of("A",'A',1,1.0);
		System.out.println(value.get(1));
		System.out.println(value.get(0));
		//instanceof : toan tu su dung de kiem tra mot doi tuong co phai la the hien cua mot lop hay khong 
		System.out.println(value.get(3) instanceof Integer);
		List myList = new ArrayList<>(Arrays.asList("A",'A',1,232));
		System.out.println(myList);
		//Neu nhu muon khai bao kieu du lieu cu the thi List<Kieu du lieu cu the>
	}

}
