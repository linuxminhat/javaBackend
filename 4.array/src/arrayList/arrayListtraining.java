package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayListtraining {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Java");
		arrayList.add("C#");
		arrayList.add("Python");
		arrayList.add("Ruby");
		//convert arrayList to array
		System.out.println("Convert ArrayList to Array");
		String[] item = arrayList.toArray(new String[arrayList.size()]);
		//show item
		for(String s:item) {
			System.out.println(s);
		}
		System.out.println(arrayList.toString());//In toan bo mang trong ArrayList
	}

}
