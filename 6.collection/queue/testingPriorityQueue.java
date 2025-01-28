package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class testingPriorityQueue {
	public static void main(String[] args) {
		Queue<Integer> myQueue = new PriorityQueue<>();
		myQueue.add(23);
		myQueue.add(2);
		myQueue.add(3);
		myQueue.add(1);
		System.out.println(myQueue);
		//Hang doi uu tien nen sap xep gia tri theo thu tu tang dan 
		
	}
}
