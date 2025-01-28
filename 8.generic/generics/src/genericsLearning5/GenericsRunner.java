package genericsLearning5;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {
	//Create generics for method 
	static <X> X doSomething(X value){
		/*
		 * <X> : Khai bao kieu tham so generic
		 * X : kieu du lieu tra ve trong ham. VD : goi String -> String, goi Integer -> Integer
		 * X value : tham so kieu dau vao
		 */
		return value;
	}
	static <X> X doubleValue(X value) {
		return value;
	}
	static <X extends List> void duplicate(X list) {
		list.addAll(list);//duplicate list by add one more time
	}
	static double sumOfNumberList(List<? extends Number> numbers){
		double sum=0.0;
		for(Number number:numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}
	public static void main(String[] args) {
////		MyCustomList<String> list1 = new MyCustomList<>();
////		list1.addElement("Element1");
////		list1.addElement("Element2");
////		list1.addElement("Element3");
////		String value = list1.getElement(0);
////		System.out.println(value);
//		MyCustomList<Integer> list2 = new MyCustomList<>();
//		list2.addElement(2810);
//		list2.addElement(19);
//		list2.addElement(284);
//		MyCustomList<Long> list3 = new MyCustomList<>();
//		list3.addElement(2810l);
//		list3.addElement(19l);
//		list3.addElement(284l);
//		Long value = list3.getElement(3);
//		System.out.println(value); 
//		//-------
//		String valueString = doubleValue(new String());
//		Integer valueInteger =  doubleValue(Integer.valueOf(100));
//		ArrayList valueArrayList = doubleValue(new ArrayList());
//		ArrayList numbers = new ArrayList<>(List.of(1,2,3,4,5));
//		duplicate(numbers);
//		System.out.println(numbers);
		System.out.println(sumOfNumberList(List.of(1,2,3,4,5)));
		System.out.println(sumOfNumberList(List.of(1l,2l,3l,4l,5l)));
		
		
	}

}
