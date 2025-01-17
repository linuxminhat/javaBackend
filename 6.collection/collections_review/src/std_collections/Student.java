package std_collections;

public class Student implements Comparable<Student> {
	private int ID;
	private String name;
	public Student(int iD, String name) {
		super();
		ID = iD;
		this.name = name;
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
	public String toString() {
		return ID + "" + name;
	}
	@Override
	public int compareTo(Student that) {
		// TODO Auto-generated method stub
		return Integer.compare(this.ID, that.ID);
	}
			

}
