package queue1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class CompareBetweenNumber implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.length(), o2.length());
	}

	 
	
}
public class learningQueue8 {
	public static void main(String[] args) {
		Queue<String> myQueue1 = new PriorityQueue<>(Arrays.asList("Dang","Nhat","Minh","yeu","Huynh","Thao","Linh"));
		System.out.println(myQueue1);
		Queue<String> myQueue2 = new PriorityQueue<>(new CompareBetweenNumber());
		myQueue2.addAll(myQueue1);
		System.out.println(myQueue2);
		
	}
}
 