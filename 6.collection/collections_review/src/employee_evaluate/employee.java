package employee_evaluate;

public class employee implements Comparable<employee>{
	int ID;
	String name;
	int salary;
	boolean sex;//true -> male / false -> female
	int KPI;
	public employee(int iD, String name, int salary, boolean sex, int kPI) {
		super();
		ID = iD;
		this.name = name;
		this.salary = salary;
		this.sex = sex;
		KPI = kPI;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public int getKPI() {
		return KPI;
	}
	public void setKPI(int kPI) {
		KPI = kPI;
	}
	public String toString() {
		return ID + "" + name + "" + salary + "" + sex + "" + KPI;
	}
	@Override
	public int compareTo(employee that) {
		// TODO Auto-generated method stub
		return Integer.compare(this.KPI, that.KPI);
	}

}
