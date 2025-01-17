package set;

import java.util.HashSet;
import java.util.Set;

public class hashSet3 {
	public static void main(String[] args) {
		//Tim phan tu chung 2 HashSet cho truoc 
		HashSet<String> myHashSet1 = new HashSet<String>(Set.of("DangNhatMinh","NguyenDucChung","TranLeMinh"));
		HashSet<String> myHashSet2 = new HashSet<String>(Set.of("DangNhatMinh","NguyenDucChung","TranLeMinh","HuynhThaoLinh"));
		if(myHashSet1.size()>myHashSet2.size()) {
			for(String item:myHashSet2) {
				if(myHashSet1.contains(item)) {
					System.out.println("Phan tu trung la" + item);
				}else {
					System.out.println("Phan tu khong trung la" + item);
				}
			}
		}else {
			for(String item:myHashSet1) {
				if(myHashSet2.contains(item)) {
					System.out.println("Phan tu trung la" + item);
				}else {
					System.out.println("Phan tu khong trung la" + item);
				}
			}
		}
		//Tim phan tu chung cua nhieu HashSet
		HashSet<String> myHashSet3 = new HashSet<String>(Set.of("NguyenNhuNgoc","NguyenBaoNghi","DangNhatMinh"));
		HashSet<String> myHashSet4 = new HashSet<String>(Set.of("LeHoangVy","ChauNhaThy","DangNhatMinh"));
		//Y tuong : tao HashSet rieng biet 
		HashSet<String> finalHashSet = new HashSet<String>(Set.of(null));
		for(String item:myHashSet1) {
			finalHashSet.add(item);
		}
	}

}
