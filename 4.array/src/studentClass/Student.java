package studentClass;

public class Student {
	String name;
	int[] mark;
	int sumOfMarks = 0;
	//declare constructor
	public Student(String name, int[] mark ) {
		this.name = name;
		this.mark = mark;
	}
	//call get and set
	public void setMark(int[] mark) {
		this.mark = mark;
	}
	public int[] getMark() {
		return mark;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getNumberOfMarks(int[]mark) {
		return mark.length;
		
	}
	public int getTotalSumOfMarks(int[]mark) {
		for(int i=0;i<mark.length;i++) {
			sumOfMarks+=mark[i];
		}
		return sumOfMarks;
	}
//	public int getMaximumMark(int[]mark) {
//		int temp_MaximumMark = mark[0];
//		for(int i=1;i<mark.length;i++) {
//			if(mark[i]>temp_MaximumMark) {
//				temp_MaximumMark=mark[i];
//			}
//		}
//		return temp_MaximumMark;		
//	}
	public int getMinimumMark(int[]mark) {
		int temp_MinimumMark = mark[0];
		for(int i=1;i<mark.length;i++) {
			if(mark[i]<temp_MinimumMark) {
				temp_MinimumMark=mark[i];
			}
		}
		return temp_MinimumMark;
	}
	public int getAverageMark(int[]mark) {
		int temp_sum=0;
		for(int i=0;i<mark.length;i++) {
			temp_sum+=mark[i];
		}
		return temp_sum/(mark.length);
	}
	
	

}
