package streams;

import java.util.List;

public class exercise {
	
	public static void main(String[] args) {
	//print only odd number 
		List<Integer> myList1 = List.of(1,2,3,4,5,6,7,8,9,10);
		myList1.stream().filter(e->e%2!=0).forEach(System.out::print);
		List<String> courses = List.of("Spring", "SpringBoot", "API", "Microservices", "Azure", "Docker");
		courses.stream().forEach(e->System.out.println(e));
		List<Character> myList2 = List.of('S','p','r','i','n','g');
		myList2.stream().forEach(e->System.out.println(e));
		courses.stream().filter(coursess -> coursess.length()>=4).forEach(e->System.out.println(e));
		//print the number of character
		courses.stream().map(e->e.length()).forEach(e->System.out.println(e));
	}

}
