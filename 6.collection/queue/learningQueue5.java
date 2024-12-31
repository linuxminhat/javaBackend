package queue1;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String value1, String value2) {
		// TODO Auto-generated method stub
		return Integer.compare(value1.length(), value2.length());
	}
	
}
public class learningQueue5 {
 public static void main(String[] args) {
	Queue<String> myQueue = new PriorityQueue<>();
	myQueue.addAll(List.of("Dang","Nhat","Minh"));
//	System.out.println(myQueue.poll());
//	System.out.println(myQueue.poll());
//	System.out.println(myQueue.poll());
	Queue<String> myQueue1 = new PriorityQueue<>(new StringLengthComparator());
	myQueue1.addAll(List.of("Zebra","Monkey","Cat"));
	System.out.println(myQueue1.poll());
	System.out.println(myQueue1.poll());
	System.out.println(myQueue1.poll());
 	}
}
