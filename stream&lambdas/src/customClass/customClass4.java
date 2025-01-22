package customClass;

import java.util.List;

class Courses4{
	private String name;
	private String category;
	private int coursesFee;
	private int numberOfLearneres;
	public Courses4(String name, String category,int coursesFee, int numberOfLearneres){
		this.name=name;
		this.category=category;
		this.coursesFee=coursesFee;
		this.numberOfLearneres=numberOfLearneres;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category=category;
	}
	public int getCoursesFee() {
		return coursesFee;
	}
	public void setCoursesFee(int coursesFee) {
		this.coursesFee=coursesFee;
	}
	public int getNumberOfLearners() {
		return numberOfLearneres;
	}
	public void setNumberOfLearners(int numberOfLearneres) {
		this.numberOfLearneres=numberOfLearneres;
	}
	public String toString() {
		return name + ":"+category+":"+coursesFee+":"+numberOfLearneres;
	}
	
}
public class customClass4 {
	public static void main(String[] args) {
		List<Courses4> myCourses = List.of(new Courses4("Java","Algo",2810,20000));
		System.out.println(myCourses);
		boolean checkingBool1 = myCourses.stream().allMatch(n->n.getNumberOfLearners()>1000);
		System.out.println(checkingBool1);
		boolean checkingBool2 = myCourses.stream().noneMatch(n->n.getCoursesFee()>10000);
		
		
	}
	

}
