package StudentCollection;

public class Students {
	private String name;
	private int id;
	Students(String name,int id){
		this.id=id;
		this.name=name;
	}
	public void setID(int id) {
		this.id=id;
	}
	public int getID() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return id + "" + name;
	}
}
