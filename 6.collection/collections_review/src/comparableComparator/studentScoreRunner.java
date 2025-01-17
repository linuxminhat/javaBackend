package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class sortLargestToSmallest implements Comparator<studentScore>{

	public int compare(studentScore student1, studentScore student2) {
		// TODO Auto-generated method stub
		return Integer.compare(student1.getScore(),student2.getScore() );
	}
	
}
public class studentScoreRunner {
	public static void main(String[] args) {
		List<studentScore> students = List.of(new studentScore(10,"Minh"), new studentScore(9,"Chung"));
		ArrayList<studentScore> myArrayList = new ArrayList<studentScore>(students);
		Collections.sort(myArrayList,new sortLargestToSmallest());
		System.out.println("Sort" + myArrayList);
		
		
	}

}
