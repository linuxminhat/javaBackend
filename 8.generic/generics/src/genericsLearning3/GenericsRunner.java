package genericsLearning3;

public class GenericsRunner {
	public static <T> void main(String[] args) {
		myCustomList<String> list1 = new myCustomList<String>();
		list1.addElement("DangNhatMinh");
		list1.addElement("NguyenDucChung");
		list1.addElement("HuynhThaoLinh");
		System.out.println(list1);
		System.out.println(list1.get(1));
		String value1 = list1.get(0);
		System.out.println(value1);
		
		myCustomList<Integer> list2 = new myCustomList<Integer>();
		list2.addElement(2810);
		list2.addElement(131);
		list2.addElement(59);
		System.out.println(list2);
		System.out.println(list2.get(1));
		Integer value2 = list2.get(0);
		System.out.println(value2);
		
		
	}

}
