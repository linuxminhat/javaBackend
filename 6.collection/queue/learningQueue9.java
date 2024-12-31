package queue1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class CompareTwoBoolean implements Comparator<Boolean>{

	@Override
	public int compare(Boolean o1, Boolean o2) {
		// TODO Auto-generated method stub
		return Boolean.compare(o1, o2);
	}
	
}
public class learningQueue9 {
	public static void main(String[] args) {
		Queue<Boolean> myQueue = new PriorityQueue<>(Arrays.asList(true,true,false,true,false,true,true));
		System.out.println(myQueue);
		Queue<Boolean> myQueue1 = new PriorityQueue<>(new CompareTwoBoolean());
		myQueue1.addAll(myQueue);
		System.out.println(myQueue1);
	}
}
