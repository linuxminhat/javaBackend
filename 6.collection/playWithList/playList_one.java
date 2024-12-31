package playWithList;

import java.util.ArrayList;
import java.util.List;

public class playList_one {
	public static void main(String[] args) {
		List<String> studentName = List.of("Dang Nhat Minh","Nguyen Duc Chung"
				,"Tran Le Minh","Nguyen Gia Bao");
//		studentName.add("Huynh Thi Thuc Vi");
//		studentName.add("Dang Nhat Minh");=> Immutable so we cant add
		List<String> crushName = new ArrayList<>(List.of("Thao Linh","Thao Nguyen",
				"Phuong Ha"));
		crushName.add("Emma Stone");
		System.out.println(crushName.toString());
		List<Integer> myNumber = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
		myNumber.add(11);
		System.out.println(myNumber);
	}

}
