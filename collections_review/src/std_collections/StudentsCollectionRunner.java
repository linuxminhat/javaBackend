package std_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsCollectionRunner {
	public static void main(String[] args) {
		List<Student> myListStudent = List.of(new Student(1,"NM"), new Student(2,"DC"), new Student(3,"LM"));
		System.out.println(myListStudent);
		ArrayList<Student> myArrayListStudent = new ArrayList<Student>(myListStudent);
		Collections.sort(myArrayListStudent);
		System.out.println(myArrayListStudent);
	}

}
