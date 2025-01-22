package customClass;

import java.util.List;

class courses{
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudent;
	public courses(String name,String category,int reviewScore, int noOfStudent) {
		this.name=name;
		this.category=category;
		this.reviewScore=reviewScore;
		this.noOfStudent=noOfStudent;
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
	public int getNoOfStudent() {
		return noOfStudent;
	}
	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent=noOfStudent;
	}
	public String toString() {
		return name + ":" + category + ":" + reviewScore + ":" + noOfStudent+ "!";
	}
	
}

public class customClass1 {
	public static void main(String[] args) {
		List<courses> myCourses = List.of(new courses("Algo","Programming",100,10000));
	}

}
