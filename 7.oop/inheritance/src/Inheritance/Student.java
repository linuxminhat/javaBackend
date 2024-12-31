package Inheritance;

public class Student extends Person {
	private String uniName;
	private String majorName;
	private double GPA;
	public Student(String uniName, String majorName,int GPA) {
		this.uniName=uniName;
		this.majorName=majorName;
		this.GPA=GPA;
	}

}
