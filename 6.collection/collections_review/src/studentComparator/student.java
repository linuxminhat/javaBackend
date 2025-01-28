package studentComparator;

import java.util.Comparator;

public class student {
	int ID;
	String name;
	int grade;
	public student(int iD, String name, int grade) {
		super();
		ID = iD;
		this.name = name;
		this.grade = grade;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	

}
