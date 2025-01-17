package student_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import student_collections.student;

public class studentRunner {
	public static void main(String[] args) {
		// student(int ID,String name, int grade, boolean sex)
		List<student> myStudentList = List.of(new student(1,"NhatMinh",10,true), 
				new student(2,"DucChung",10,true),
				new student(3,"LeMinh",9,true));
		ArrayList<student> myStudentArrayList = new ArrayList<student>(myStudentList);
		System.out.println(myStudentArrayList);
		Collections.sort(myStudentArrayList); // Sort using Comparable

        System.out.println("After Sorting: " + myStudentArrayList);
	}
	

}
