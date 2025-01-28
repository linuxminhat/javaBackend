package customClass;

import java.util.List;

class Courses3{
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;
	public Courses3(String name,String category,int reviewScore,int noOfStudents) {
		this.name=name;
		this.category=category;
		this.reviewScore=reviewScore;
		this.noOfStudents=noOfStudents;
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
	public int getReviewScore() {
		return reviewScore;
	}
	public void setReviewScore(int reviewScore) {
		this.reviewScore=reviewScore;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents=noOfStudents;
	}
	public String toString() {
		return name + ":" + category+ ":" + reviewScore+":" +noOfStudents;
	}
}
public class customClass3 {
	public static void main(String[] args) {
		List<Courses3> myCourses = List.of(new Courses3("Spring","JavaDevelopment",2810,2000));
		boolean resultsFinal = myCourses.stream().allMatch(n -> n.getReviewScore()>10);
		
		
	}

}
