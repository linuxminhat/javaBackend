package queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

class ascendingWordLength implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.length(), o1.length());
	}
	
}

public class queue5 {
	public static void main(String[] args) {
		Queue<String> myQueue = new PriorityQueue<String>(new ascendingWordLength());
		System.out.println(myQueue);
		myQueue.addAll(List.of("LionelMessi","CristianoRonaldo","NeymarJR","LuisSuarez","GarethBale","Benzema"));
		System.out.println(myQueue);
		while(!myQueue.isEmpty()) {
			System.out.println(myQueue.poll());
		}
		Stack<String> myStack = new Stack<String>();
		
		
	}

}
