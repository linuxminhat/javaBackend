package map;

import java.util.HashMap;

public class map5 {
	public static void main(String[] args) {
		String[] array5 = {"Dinh","Dinh","Tinh","Chinh","Linh","Dinh","Dinh","Tinh","Chinh","Linh"};
		HashMap<String,Integer> map5 = new HashMap<String,Integer>();
		for(String i:array5) {
			if(map5.containsKey(i)==false) {
				map5.put(i, 1);
			}else {
				int appearance_times=map5.get(i);
				appearance_times++;
				map5.put(i, appearance_times);
			}
		}
		System.out.println(map5);
	}

}
