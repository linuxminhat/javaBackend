package map;

import java.util.HashMap;

public class map10 {
	public static void main(String[] args) {
		String myString = "I love you Thao Linh forever";
		HashMap<Character,Integer> map10 = new HashMap<Character,Integer>();
		for(Character i:myString.toCharArray()) {
			if(map10.containsKey(i)==false) {
				map10.put(i, 1);
			}else {
				int time_appear=map10.get(i);
				time_appear++;
				map10.put(i, time_appear);
			}
		}
		System.out.println(map10);
	}

}
