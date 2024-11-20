package arraySimple;

public class arrayofClass {
	
	class Person{
		int age;
	}
	public static void main(String[] args) {
		//Its called an array of object 
		Person[] persons = new Person[10];
				for(int i=0;i<persons.length;i++) {
					System.out.println(persons[i]);		
				}
	}
	 
} 
