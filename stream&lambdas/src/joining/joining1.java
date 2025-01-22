package joining;

import java.util.List;
import java.util.stream.Collectors;

public class joining1 {
	public static void main(String[] args) {
		List<String> courses = List.of("Spring","SpringBoot", "API", "Microservices", "AWS", "Azure");
		//I want to combine all of this 
		System.out.println(courses.stream().collect(Collectors.joining(" ")));
		System.out.println(courses.stream().collect(Collectors.joining(" + ")));
	}

}
