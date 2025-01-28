package genericsLearning2;

public class GenericsRunner {
	public static void main(String[] args) {
		MyCustomList<String> list1 = new MyCustomList<>();
		list1.addElement("Element1");
		list1.addElement("Element2");
		
		System.out.println(list1);
		
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(23));
		list2.addElement(Integer.valueOf(28));
		
		System.out.println(list2);
		
	}

}
