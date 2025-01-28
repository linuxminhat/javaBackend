package map;

import java.util.LinkedHashMap;

public class learningLinkedHashMap4 {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> myLinkedHashMap = new LinkedHashMap<>();
		myLinkedHashMap.put("DangNhatMinh", 2810);
		myLinkedHashMap.put("NguyenThiThanhThien", 2102);
		myLinkedHashMap.put("HuynhThaoLinh",50923);
		myLinkedHashMap.put("VoThiBachDuong", 3232);
		System.out.println(myLinkedHashMap);
		System.out.println(myLinkedHashMap.containsKey("Concac"));
	}
}
