package set;

import java.util.HashSet;
import java.util.Set;

public class hashSet1 {
	/*
	 * Note ! 
	 * Chi chua phan tu duy nhat, khong cho 2 phan tu trung nhau
	 * Luu tru phan tu bang co che hashing, bam
	 * Khong dam bao thu tu duoc them
	 * Cho phep luu phan tu null
	 */
	//Khai bao cau truc Syntax giong y nhu trong ArrayList 
	public static void main(String[] args) {
		HashSet<Integer> myHashSet1 = new HashSet<Integer>(Set.of(1,2,3,4,5,6,7,8,9,10));
		System.out.println(myHashSet1);
		myHashSet1.add(100);
		System.out.println(myHashSet1);
		System.out.println(myHashSet1.add(100));
		System.out.println(myHashSet1.isEmpty());
		myHashSet1.add(null);
		System.out.println(myHashSet1);
		System.out.println(myHashSet1.hashCode());//hashCode() : trả về giá trị bảng băm 
		
	}
}
