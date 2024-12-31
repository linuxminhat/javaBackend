package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class testingQueue2 {

	public static void main(String[] args) {
		Queue<Integer> myQueue = new PriorityQueue<>();
		myQueue.add(100);
		myQueue.add(23);
		myQueue.add(1);
		myQueue.add(0);
		myQueue.add(4);
		System.out.println(myQueue);
	}
}
