package studentClass;

public class studentRunner {
	public static void main(String[] args) {
		int[] mark = {100,99,98};
		Student studentA = new Student("12A2",mark );
		System.out.println(studentA.getTotalSumOfMarks(mark));		
		System.out.println(studentA.getNumberOfMarks(mark));
//		System.out.println(studentA.getMaximumMark(mark));
		System.out.println(studentA.getAverageMark(mark));
	}

}
