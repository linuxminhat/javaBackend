package map;

import java.util.HashMap;

public class map3 {
	public static void main(String[] args) {
		//Cai dat in ra so phan tu cua Map
		String[] array = {"Minh","Chung","Minh","Linh","Linh","Chung","Chung","Minh","Minh","Linh","Duong"};
		HashMap<String,Integer> map3 = new HashMap<String,Integer>();
		for(String i:array) {
			//Checking
			if(map3.containsKey(i)==false) {
				map3.put(i, 1);
			}else {
				int appear_times = map3.get(i);
				appear_times++;
				map3.put(i, appear_times);
				
			}
		}
		System.out.println(map3);
		
	}

}
