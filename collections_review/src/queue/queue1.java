package queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue1 {
	public static void main(String[] args) {
		//Queue la 1 Interface va khoi tao no bang lop cu the
		Queue<String> myQueue = new PriorityQueue<>();
		System.out.println(myQueue);
		myQueue.poll();
		System.out.println(myQueue.poll());
		myQueue.offer("Apple");
		System.out.println(myQueue);
		myQueue.addAll(List.of("Banana","Pineapple","Orange"));
		System.out.println(myQueue);
		myQueue.add("Cat");
		System.out.println(myQueue);
		System.out.println(myQueue.poll());
		System.out.println(myQueue);
		System.out.println(myQueue.poll());
		//Priority here is natural ! 
		
	}
}
