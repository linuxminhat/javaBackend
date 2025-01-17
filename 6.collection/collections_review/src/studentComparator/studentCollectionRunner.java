package studentComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import student_collections.student;
//Tao lop moi -> Lop nay trien khai Interface Comparator 
class DescendingStudentComparator implements Comparator<student>{

	@Override
	public int compare(student o1, student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getID(), o2.getID());
	}
}
public class studentCollectionRunner {
	public static void main(String[] args) {
		List<student> myStudentList = List.of(new student(1,"NhatMinh",10,true), 
				new student(2,"DucChung",10,true),
				new student(3,"LeMinh",9,true));
		ArrayList<student> myArrayStudentList = new ArrayList<student>(myStudentList);
		System.out.println(myArrayStudentList);
		//Collections.sort(List<T> list, Comparator<? super T> c);
		Collections.sort(myArrayStudentList, new DescendingStudentComparator());//ham khoi tao
		System.out.println(myArrayStudentList);
		
	}

}
