package objectComposition;

public class fan {
	//declare all the state 
	private String name;
	private int number;
	private String color;
	private String maker;
	private boolean isOn;
	public byte speed;
	//declare get and set function
	public String getName() {
		return name;
	}
	public void setName() {
		this.name=name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber() {
		this.number=number;
	}
	public String getColor() {
		return color;
	}
	public void setColor() {
		this.color=color;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker() {
		this.maker=maker;
	}
	//declare constructor 
	public fan(String name,int number,String color,String maker) {
		this.name=name;
		this.number=number;
		this.color=color;
		this.maker=maker;
		this.isOn=isOn;
	}
	//there are 2 ways to write code in this 
	public void onOrOff(boolean isOn) {
		this.isOn=isOn;
	}
	//another way 
	public void  switchOn() {
		this.isOn=true;
		setSpeed((byte)0);
	}
	public void switchOff() {
		this.isOn=false;
		setSpeed((byte)5);
	}
	// -------------------// 
	public void setSpeed(byte speed) {
		this.speed=speed;
	}
	//declare a toString Function
	public String toString() {
		return "name"+name+"number"+number+"color"+color+"maker"+maker+"isOn"+isOn+"speed"+speed;
	}
}
