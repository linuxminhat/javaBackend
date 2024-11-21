package stringClass;

public class stringClass {
	//Declare String 
//	String str1 = new String("concac");
//	String str2 = new String("concac");
	//Compare them 
	public static void main(String[] args) {
		String str1 = new String("concac");
		String str2 = new String("concac");
		//its false because its is located in heap 
		System.out.println(str1 == str2);
		//Some available function to use 
		//Get char at a string -> function1
		System.out.println(str1.charAt(0));
		for(int index=0;index<=5;index++) {
			System.out.print(str1.charAt(index));
		}
		System.out.println();
		//Get a sub string in a string ->  function2
		String str3 = new String("This is my first with string");
		System.out.println(str3);
		System.out.println(str3.substring(5)); 
		System.out.println(str3.substring(5,13)); 
		//thu in ra vi tri khong co char 
//		System.out.println(str3.substring(30)); -> throw an exception
		//Check if one string is available 
		System.out.println(str3.contains("string"));
	}

}
