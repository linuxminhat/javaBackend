package queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

//Ascending word length
class descendingWordLength implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.length(), o2.length());
	}
	
}
public class queue4 {
	public static void main(String[] args) {
		Queue<String> myQueue = new PriorityQueue<String>(new ascendingWordLength());
		System.out.println(myQueue);
		myQueue.addAll(List.of("DangNhatMinh","NguyenChung","TranLeMinh","HuynhLinh","VoHoangBachDuong"));
		System.out.println(myQueue);
		while(!myQueue.isEmpty()) {
			System.out.println(myQueue.poll());//Note : poll for delete
		}
	}

}
