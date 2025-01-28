package student_collections;

import java.util.Comparator;

public class student implements Comparable<student> {
	int ID;
	String name;
	int grade;
	boolean sex;
	public student(int ID,String name, int grade, boolean sex) {
		this.ID = ID;
		this.name = name;
		this.grade = grade;
		this.sex = sex;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID=ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public boolean getSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex=sex;
	}
	public String toString() {
		return ID + "" + name + "" + grade + "" + sex;
	}
	@Override
	public int compareTo(student that) {
		// TODO Auto-generated method stub
		return Integer.compare(this.grade,that.grade );
	}
	 
	 
}
