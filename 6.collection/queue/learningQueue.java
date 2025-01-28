package queue1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class learningQueue {
	public static void main(String[] args) {
		Queue<String> myQueue = new PriorityQueue<>();
		System.out.println(myQueue);
		List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		Queue<Integer> myList1 = new PriorityQueue<>(Arrays.asList(1,23,435235));
		System.out.println(myList1);
		
		
	}
}
