package teacher_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class teacherRunner {
	public static void main(String[] args) {
		ArrayList<teacher> myArrayList = new ArrayList<teacher>(List.of(new teacher(1,"Ha",true), new teacher(2,"Minh",true)));
	
		System.out.println(myArrayList.size());
		Collections.sort((List<teacher>) myArrayList);
		
		
	}

}
