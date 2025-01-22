//package joining;
//
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class flatMap1 {
//	public static void main(String[] args) {
//		//Learn using flatMap
//		List<List<Integer>> listOfList = List.of(List.of(1,2,3),List.of(4,5,6),List.of(7,8,9));
//		System.out.println(listOfList);
//		listOfList.stream().map(e->e.stream()).collect(Collectors.toList());
//		System.out.println(listOfList.stream().map(e->e.stream()).collect(Collectors.toList()));
//		System.out.println(listOfList.stream().flatMap(e->e.stream()).collect(Collectors.toList()));
//		List<String> list1 = List.of("Spring","Boot","Easy");
//		System.out.println(list1.stream().flatMap(list1->Stream.of(list1.split(""))));
//	}
//
//}
