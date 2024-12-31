package map;

import java.util.TreeMap;

public class learningTreeMap1 {
	public static void main(String[] args) {
		TreeMap<String,Integer> myTreeMap = new TreeMap<>();
		myTreeMap.put("DangNhatMinh", 2810);
		myTreeMap.put("NguyenDucChung", 1301);
		System.out.println(myTreeMap);
		myTreeMap.put("AKJurachi", 21212);
		System.out.println(myTreeMap);
		
	}
}
