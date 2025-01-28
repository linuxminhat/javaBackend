package queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class rankingHighestToLowest implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return Integer.compare(o2.intValue(), o1.intValue());
	}
	
}
public class queue3 {
	public static void main(String[] args) {
		//Trong Queue khong phai sap xep nhu List 
		//Neu muon lay thu tu uu tien cao nhat thi phai in ra
		Queue<Integer> myQueue = new PriorityQueue<Integer>(new rankingHighestToLowest());
		System.out.println(myQueue);
		myQueue.addAll(List.of(1,32,78,545,22,99,100,2003));
		System.out.println(myQueue);
		while(!myQueue.isEmpty()) {
			System.out.println(myQueue.poll());
		}
	}
	/*
	 * poll va peek khac gi nhau ?
	 * poll lay nhung xoa
	 * peek lay nhung khong xoa
	 */

}
