package CarCollection;

public class Car implements Comparable<Car> {
	private String name;
	private int id;
	private boolean discount;
	Car(String name,int id,boolean discount){
		this.name=name;
		this.id=id;
		this.discount=discount;
	}
	public String getName(String name) {
		return name;
	}
	public void setName() {
		this.name=name;
	}
	public int getID(int id) {
		return id;
	}
	public void setID() {
		this.id=id;
	}
	public boolean getDiscount(boolean discount) {
		return discount;
	}
	public void setDiscount() {
		this.discount=discount;
	}
	public String toString() {
		return "Information : " + " " + name + " " + " " + id + " " +  discount;
	}
	@Override
	public int compareTo(Car that ) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id,that.id );
	}
	
	
	

}
