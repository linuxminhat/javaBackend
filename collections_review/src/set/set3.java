	package set;
	
	import java.util.Set;
	
	public class set3 {
		public static void main(String[] args) {
			Set<Integer> testSet1 = Set.of(1,2,3,4,5);
			System.out.println(testSet1);
			Set<String> testSet2 = Set.of("DangNhatMinh","NguyenDucChung","TranLeMinh");
			System.out.println(testSet2);
			testSet1.add(6);
			System.out.println(testSet1);//Error => because Immutable
			
			 
			
		}
	
	}
