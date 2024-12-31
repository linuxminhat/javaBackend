package queue1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class CompareTwoNumber implements Comparator<Integer>{

	@Override
	public int compare(Integer number1, Integer number2) {
		// TODO Auto-generated method stub
		return Integer.compare(number1, number2);
	}
	
}
public class learningQueue6 {
	public static void main(String[] args) {
		Queue<Integer> myQueue = new PriorityQueue<>(Arrays.asList(1,322,4,535,1231,5215));
//		System.out.println(myQueue);
		Queue<Integer> myQueue1 = new PriorityQueue<>( new CompareTwoNumber());
		myQueue1.addAll(myQueue);
		System.out.println(myQueue1.poll());
		System.out.println(myQueue1.poll());
		System.out.println(myQueue1.poll());
	}
}
