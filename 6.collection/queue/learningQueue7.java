package queue1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class CompareTwoNumb implements Comparator<Integer>{

	@Override
	public int compare(Integer value1, Integer value2) {
		// TODO Auto-generated method stub
		return Integer.compare(value1, value2);
	}
	
}
public class learningQueue7 {
	public static void main(String[] args) {
		Queue<Integer> myQueue = new PriorityQueue<>(Arrays.asList(34,12,1,323,6767,3,111));
		System.out.println("Unsorted Queue" + myQueue);
		Queue<Integer> myQueue1 = new PriorityQueue<>(new CompareTwoNumber());
		myQueue1.addAll(myQueue);
		System.out.println(myQueue1.poll());
		
	}
}
