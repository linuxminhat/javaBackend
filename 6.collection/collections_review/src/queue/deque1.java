package queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class deque1 {
	public static void main(String[] args) {
//		Queue<String> myQueue = new Queue<String>();
		Queue<String> myPriorityQueue = new PriorityQueue<String>();
		myPriorityQueue.add("DangNhatMinh");
		myPriorityQueue.add("NguyenDucChung");
		myPriorityQueue.add("TranLeMinh");
		System.out.println(myPriorityQueue);
		Queue<String> myArrayDeQueue = new ArrayDeque<String>();
		System.out.println(myArrayDeQueue);
		myArrayDeQueue.addAll(myPriorityQueue);
		System.out.println(myPriorityQueue);
		
	}

}
