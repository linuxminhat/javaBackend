package reviewfan;

import java.sql.Date;

public class car {
	String name;
	String maker;
//	public enum col{
//		black,
//		white,
//		green,
//		blue
//	}
	int numberOfCar;
	int yearOfDate;
	//declare constructor 
	car(String name, String maker,int numberOfCar,int yearOfDate){
		this.name=name;
		this.maker=maker;
		this.numberOfCar=numberOfCar;
		this.yearOfDate=yearOfDate;
	}
	public String toString() {
		return "name"+name+"maker"+maker+"numberOfCar"+numberOfCar+"yearOfDate"+yearOfDate;
		
	}
	

}
