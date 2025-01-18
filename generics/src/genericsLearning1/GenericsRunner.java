package genericsLearning1;

public class GenericsRunner {
	public static void main(String[] args) {
		MyCustomList list1 = new MyCustomList();
		list1.addElement("Element 1");
		list1.addElement("Element 2");
		
		MyCustomList list2 = new MyCustomList();
//		list2.addElement(Integer.valueOf(1));
//		list2.addElement(Integer.valueOf(2)); => ERROR 
		
		
	}

}
