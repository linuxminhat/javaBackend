package teacher_collections;

public class teacher implements Comparable<teacher> {
	private int ID;
	private String name;
	private boolean sex; //true : man, false: woman
	public teacher(int ID, String name, boolean sex) {
		this.ID=ID;
		this.name=name;
		this.sex=sex;
	}
	public int getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public boolean getSex() {
		return sex;
	}
	public void setID(int ID) {
		this.ID=ID;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSex(boolean sex) {
		this.sex=sex;
	}
	public String toString() {
		return ID+""+name+""+sex;
	}
	@Override
	public int compareTo(teacher that) {
		// TODO Auto-generated method stub
		return Integer.compare(this.ID, that.ID);
	}
}

