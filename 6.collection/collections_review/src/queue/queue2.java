package queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String value1, String value2) {
		// TODO Auto-generated method stub
		return Integer.compare(value2.length(), value1.length());
	}
	
}

public class queue2 {
	public static void main(String[] args) {
		Queue<String> myQueue = new PriorityQueue<String>( new StringLengthComparator());
		//Chi dinh Comparator vao de thuc hien, binh thuong se thuc hien thu tu tu nhien
		System.out.println(myQueue);
		myQueue.addAll(List.of("Apple","Cat","Banana","Dick"));
		System.out.println(myQueue);
		/*
		 * PriorityQueue khong giong nhu List, no khong phai la danh sach sap xep
		 * No chi dam bao phan tu co do dai cao nhat duoc in ra 
		 */
		while(!myQueue.isEmpty()) {
			System.out.println(myQueue.poll());
		}
	}

}
