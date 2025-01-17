package set;

import java.util.HashSet;
import java.util.Set;

public class hashSet2 {
	public static void main(String[] args) {
		HashSet<String> myHashSet = new HashSet<String>(Set.of("Apple","Banana","Orange","Grape","Mango"));
		//In toan bo phan tu 
		System.out.println(myHashSet);
		//Kiem tra su ton tai "Mango"
		if(myHashSet.contains("Mango")==true) {
			System.out.println("Mango ton tai!");
		}else {
			System.out.println("Mango khong ton tai!");
		}
		//Them phan tu vao va kiem tra kich thuoc
		myHashSet.add("PineApple");
		System.out.println(myHashSet.size());
		//Tao HashSet moi va loai bo phan tu
		HashSet<String> myHashSet1 = new HashSet<String>(myHashSet);
		myHashSet1.remove("Grape");
		System.out.println(myHashSet1);
		//Hop hai HashSet 
		myHashSet1.addAll(myHashSet);
		System.out.println(myHashSet1);
		//Tim phan tu chung 
		for(String item:myHashSet) {
			for(String item1:myHashSet1) {
				if(item==item1) {
					System.out.println("Phan tu chung la" + item);
				}
			}
		}
		
	}

}
