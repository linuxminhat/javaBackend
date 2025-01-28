package stringClass;

public class stringIsImmutable {
	public static void main(String[] args) {
		String str1 = new String("hello string1");
		String str2 = str1.concat("hello concac");
		System.out.println(str1);//hello string1
		System.out.println(str2);//hello concac
		String str3 = str2.concat(str1);
		System.out.println(str3);
	}
}
