package queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class queueLearning {
	public static void main(String[] args) {
		Queue<Integer> myQueue = new PriorityQueue<>();
		myQueue.add(1);
		myQueue.add(2);
		myQueue.add(3);
		myQueue.add(4);
		System.out.println(myQueue);//1 2 3 4 
		myQueue.offer(5);	
		System.out.println(myQueue);// 1 2 3 4 5 
		myQueue.addAll(List.of(1,4332,23,12,290));// 1 2 1 4 5 3 4332 23 12 290 
		System.out.println(myQueue);
		System.out.println(myQueue.poll());
		System.out.println(myQueue);
	}

}
