package queue1;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class learningQueue4 {

	public static void main(String[] args) {
		//testing
		Queue<Integer> myQueue = new PriorityQueue<>(Arrays.asList(1,3,4,5,6325,3243,31));
		/*System.out.println(myQueue);
		while(myQueue.isEmpty()==false) {
			System.out.println(myQueue.poll());
		}
		*/
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
	}
}
