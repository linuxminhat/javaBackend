package queue1;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class learningQueue3 {

	public static void main(String[] args) {
		/*
		 * Sau moi vong lap thi giam 1 phan tu nen khong duoc !
		 */
		Queue<Integer> myQueue = new PriorityQueue<>(Arrays.asList(1,42,643,2423,88,454));
//		for(int i=0;i<myQueue.size();i++) {
//			System.out.println(myQueue.poll());
//		}
		while(myQueue.isEmpty()==false) {
			System.out.println(myQueue.poll());
		}
		
		System.out.println(myQueue);
	}
}
