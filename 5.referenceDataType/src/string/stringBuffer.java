package stringClass;

public class stringBuffer {
	public static void main(String[] args) {
		String str = new String("dangnhatminh");
		System.out.println(str.concat("huynhthaolinh"));// -> dangnhatminhhuynhthaolinh
		System.out.println(str);//dangnhatminh -> nothing change
		
		/*
		 * This style of writing is bad 
		 * So, we use StringBuffer and StringBuilder instead
		 */
		StringBuffer str1 = new StringBuffer("dangnhatminh");
		System.out.println(str1.append("huynhthaolinh"));//-> dangnhatminhhuynhthaolinh
		System.out.println(str1);//-> dangnhatminhhuynhthaolinh
		//----------------------------------------------	-----------
		StringBuilder str2 = new StringBuilder("nguyenducchung");
		System.out.println(str2.append("hoangbachduong"));
		System.out.println(str2);
	
		
	}

}
