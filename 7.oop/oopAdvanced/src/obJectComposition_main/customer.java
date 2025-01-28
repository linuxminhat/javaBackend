package obJectComposition_main;

public class customer {
	public String name;
	public int age;
	public Address workaddress;
	public Address homeaddress;
	//declare a constructor 
	public customer(String name,int age,Address homeaddress) {
		this.name=name;
		this.age=age;
		this.homeaddress=homeaddress;
	}
	public String getNmae() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public Address getWorkAddress() {
		return workaddress;
	}
	public void setWorkAddress(Address workaddress) {
		this.workaddress=workaddress;
	}
	public Address getHomeAddress() {
		return homeaddress;
	}
	public void setHomeAddress() {
		this.homeaddress=homeaddress;
	}
	//declare toString 
	public String toString() {
		return "name"+name+"age"+age+"workaddress"+workaddress+"homeaddress"+homeaddress;
	}
}
