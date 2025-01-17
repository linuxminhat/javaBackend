package map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class map2 {
	public static void main(String[] args) {
		Map<String,Integer> map2 = Map.of("DangNhatMinh",2,"NguyenDucChung",3);
		List<String> mapList = new ArrayList<String>();
		System.out.println(map2);
		/*
		 * giai thich : Vi sao Map la 1 phan Collections trong Java nhung khong trien khai Interface
		 * - Map la 1 phan Collections : khong thuoc he thong ke thua Collections
		 * - Map khong trien khai Interface : Cung cap cach thuc luu tru du lieu khac, do la luu tru du lieu
		 * -> theo dang Key-Value, khac cach luu tru don le nhu List, Queue , va Set 
		 */
		System.out.println(map2.containsKey("DangNhatMinh"));
		System.out.println(map2.containsKey("HuynhThaoLinh"));
		System.out.println();
		//Dem tu "DangNhatMinh" xuat hien bao lan
		 
	}

}
