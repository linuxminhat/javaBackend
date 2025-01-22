package rvCustomClass;

import java.util.List;

class Person{
	private String namePerson;
	private int bornYear;
	private boolean sex; //true -> male, false -> female
	private String nameSchool;
	private double gpa;
	public Person(String namePerson,int bornYear,boolean sex,String nameSchool,double gpa) {
		this.namePerson=namePerson;
		this.bornYear=bornYear;
		this.sex=sex;
		this.nameSchool=nameSchool;
		this.gpa=gpa;
	}
	public String getNamePerson() {
		return namePerson;
	}
	public void setNamePerson(String namePerson) {
		this.namePerson=namePerson;
	}
	public int getBornYear() {
		return bornYear;
	}
	public void setBornYear(int bornYear) {
		this.bornYear=bornYear;
	}
	public boolean getSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex=sex;
	}
	public String getNameSchool() {
		return nameSchool;
	}
	public void setNameSchool(String nameSchool) {
		this.nameSchool=nameSchool;
	}
	public double getGPA() {
		return gpa;
	}
	public void setGPA(double gpa) {
		this.gpa=gpa;
	}
	public String toString() {
		return namePerson+" : "+bornYear+" : "+sex+" : "+nameSchool+" : "+gpa;
	}
}
public class rvCustom1 {
	public static void main(String[] args) {
		List<Person> myFriends = List.of(new Person("DangNhatMinh",2003,true,"DUT",3.41),
				new Person("NguyenDucChung",2006,true,"DUT",3.97));
		System.out.println(myFriends);
		boolean checking1 = myFriends.stream().allMatch(value1->value1.getBornYear()>=2000);
		System.out.println(checking1);
		boolean checking2 = myFriends.stream().noneMatch(value1->value1.getGPA()>=3.2);
		System.out.println(checking2);
		myFriends.stream().max((n1,n2)->Integer.compare(n1.getBornYear(), n2.getBornYear()));
		System.out.println(myFriends.stream().max((n1,n2)->Integer.compare(n1.getBornYear(), n2.getBornYear())));
		
	}
	

}
