package map;

import java.util.HashMap;

public class map6 {
	public static void main(String[] args) {
		int[] array6 = {1,2,3,2,3,4,3,4,5,4,5,6,5,6,7,6,7,8,7,8,9};
		HashMap<Integer,Integer> map6 = new HashMap<Integer,Integer>();
		for(Integer i:array6) {
			if(map6.containsKey(i)==false) {
				map6.put(i, 1);
			}else {
				int appearance_times = map6.get(i);
				appearance_times++;
				map6.put(i, appearance_times);
			}
		}
		System.out.println(map6);
	}

}
