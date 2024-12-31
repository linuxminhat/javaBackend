package queue1;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class learningQueue2 {

	public static void main(String[] args) {
		Queue<Integer> myQueue = new PriorityQueue<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		System.out.println(myQueue);
		myQueue.offer(11);
		System.out.println(myQueue);
		System.out.println(myQueue.poll());
		System.out.println(myQueue);
		
	}
}
