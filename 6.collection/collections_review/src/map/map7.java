package map;

import java.util.HashMap;

public class map7 {
	public static void main(String[] args) {
		int[] array7 = {1,2,3,2,3,4,3,4,5,4,5,6};
		HashMap<Integer,Integer> map7 = new HashMap<Integer,Integer>();
		for(Integer i:array7) {
			if(map7.containsKey(i)==false) {
				map7.put(i, 1);
			}else {
				int appear_times = map7.get(i);
				appear_times++;
				map7.put(i, appear_times);
			}
		}
		System.out.println(map7);
		System.out.println(map7.size());//size : so luong cap key-value
		//HashMap cho 1 key null va nhieu value null
		map7.put(null, null);
		map7.put(null, 1);
		System.out.println(map7);
		map7.remove(null);
		System.out.println(map7);
	}

}
