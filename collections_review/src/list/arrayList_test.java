package list;

import java.util.ArrayList;

public class arrayList_test {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		System.out.println(arrayList);
		arrayList.remove(1);
		System.out.println(arrayList);
		
	}

}
