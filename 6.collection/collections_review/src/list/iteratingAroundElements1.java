package list;

import java.util.ArrayList;
import java.util.List;

public class iteratingAroundElements1 {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10));
		for(int i=0;i<myList.size();i++) {
			System.out.println(myList.get(i));
		}
	}

}
