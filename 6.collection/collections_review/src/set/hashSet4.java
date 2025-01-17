package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class hashSet4 {
	public static void main(String[] args) {
		//Tim cac phan tu xuat hien tan suat nhieu nhat
		HashSet<Integer> hashSet1 = new HashSet<Integer>(Set.of(1,2,3,4,5));
		HashSet<Integer> hashSet2 = new HashSet<Integer>(Set.of(2,3,4,5,6));
		HashSet<Integer> hashSet3 = new HashSet<Integer>(Set.of(3,4,5,6,7));
		ArrayList<Integer> arrayList = new ArrayList<Integer>(List.of());
		System.out.println(arrayList);
		arrayList.addAll(hashSet1);
		arrayList.addAll(hashSet2);
		arrayList.addAll(hashSet3);
		System.out.println(arrayList);
	}

}
