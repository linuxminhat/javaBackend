package map;

import java.util.HashMap;

public class map4 {
	//Cho 1 mang -> In ra so lan xuat hien trong Map
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,2,3,4,5,6,3,4,5,6,7,4,5,6,7,8,5,6,7,8,9};
		HashMap<Integer,Integer> map4 = new HashMap<>();
		//Duyet phan tu trong mang 
		for(Integer i:array) {
			if(map4.containsKey(i)==false) {
				map4.put(i, 1);
			}else {
				int appear_times = map4.get(i);
				appear_times++;
				map4.put(i,appear_times );
			}
		}
		System.out.println(map4);
	}

}
