package StudentCollection;

import java.util.List;

public class StudentsCollectionRunner {
	public static void main(String[] args) {
		List<Students> students = List.of(new Students("Minh",1),
				new Students("Linh",2),
				new Students("Thanh",3));
		System.out.println(students.toString());
	}
	
}
