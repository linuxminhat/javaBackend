package queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class testingQueue3 {
	public static void main(String[] args) {
		Queue<String> myQueue = new PriorityQueue<>();
		myQueue.addAll(List.of("Z","M","C"));
		//This is the pre queue 
		System.out.println(myQueue);
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		
		Queue<Integer> myQueue1 = new PriorityQueue<>();
		System.out.println();
		System.out.println(myQueue1);
		System.out.println(myQueue1);
		
	}
}
		