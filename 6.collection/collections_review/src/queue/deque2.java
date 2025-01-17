package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class deque2 {
	public static void main(String[] args) {
		Deque<String> myDeQue = new ArrayDeque<String>();
		myDeQue.offer("NguyenDucChung");
		myDeQue.offer("DangNhatMinh");
		 
		myDeQue.offer("TranLeMinh");
		while(!myDeQue.isEmpty()) {
			System.out.println(myDeQue.poll());
		}
		Queue<String> myQueue = new PriorityQueue<String>();
		myQueue.offer("NguyenDucChung");
		myQueue.offer("TranLeMinh");
		myQueue.offer("DangNhatMinh");
		while(!myQueue.isEmpty()) {
			System.out.println(myQueue.poll());
		}
	}

}
