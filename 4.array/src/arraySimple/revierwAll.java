package arraySimple;

public class revierwAll {
	class Person{
		int age;
		
	}
	public static void main(String[] args) {
		//declare an array 
		int[] array = {1,2,3,4,5};
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		//declare an array in other way 
		int[] array1 = new int[10];
		for(int i:array1) {
			System.out.println(i);
		}
		//arry of the object 
		Person[] person = new Person[10];
		for(int i=0;i<person.length;i++) {
			System.out.println(person[i]);
		}
		
		 
	}

}
