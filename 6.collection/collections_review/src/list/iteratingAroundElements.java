package list;

import java.util.List;

public class iteratingAroundElements {
	public static void main(String[] args) {
		List<String> myList = List.of("Dang","Nhat","Minh");
		for(int i=0;i<myList.size();i++) {
			System.out.println(myList.get(i));
		}	
	}
}
