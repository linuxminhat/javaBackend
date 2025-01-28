package genericsLearning4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class genericsRunner {
	static <X> X doubleValue(X value) {
		return value;
	}
	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}
	static <X extends Set> void duplicate(X set) {
		set.addAll(set);//add them vao nua 
	}
	
	public static void main(String[] args) {
		customArrayList<Long> list1 = new customArrayList<Long>();
		list1.addElement(21l);
		list1.addElement(22l);
		list1.addElement(23l);
		System.out.println(list1);
		System.out.println(list1.getElement(0));
		customArrayList<Integer> list2 = new customArrayList<Integer>();
		list2.addElement(2810);
		list2.addElement(1301);
		list2.addElement(1911);
		System.out.println(list2);
		Integer birthdayDate = list2.getElement(0);
		System.out.println(birthdayDate);
		String stringValue = doubleValue(new String());
		Integer integerValue = doubleValue(Integer.valueOf(100));
		ArrayList arrayList = doubleValue(new ArrayList());
		ArrayList numbers = new ArrayList<>(List.of(1,2,3,4,5));
		duplicate(numbers);
		System.out.println(numbers);
		
	}
	

}
