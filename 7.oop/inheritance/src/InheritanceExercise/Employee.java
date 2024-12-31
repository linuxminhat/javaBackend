package InheritanceExercise;

public class Employee extends Person {
	public String titile; //manager or something
	public String employer;
	public double salary;
	public Employee(String titile,String employer, double salary) {
		this.titile=titile;
		this.employer=employer;
		this.salary=salary;
	}
	public String toString() {
		return "titile" + titile + "employer" + employer + "salary" + salary;
	}

}
