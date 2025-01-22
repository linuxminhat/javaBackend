package filteringFP;

import java.util.List;

public class filteringFP2 {
	public static void printingWithFP(List<Integer> myList) {
		myList.stream().filter(e->e%2==0).forEach(e->System.out.println(e));
	}
	public static void printingStringElement(List<String> myList) {
		myList.stream().filter(e->e.endsWith("at")).forEach(e->System.out.println(e));
	}
	public static void printingWithFP1(List<Integer>myList) {
		myList.stream().filter(e->e%2!=0).forEach(e->System.out.println(e));
	}
	public static void printingWithFP2(List<Boolean>myList) {
		myList.stream().filter(e->e==true).forEach(e->System.out.println(e));
	}
	public static void printingWithFP3(List<Boolean>myList) {
		myList.stream().filter(e->e==false).forEach(e->System.out.println(e));
	}
	public static void printingWithFP4(List<String> myList) {
		myList.stream().filter(e->e.endsWith("at")).forEach(e->System.out.println(e));
	}

}
