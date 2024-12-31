package abstraction_noArguments;

public class motorBike {
	int speed;
	motorBike(){
		//declare constructor with no arguments
		this(0);
		//If we dont set speed => it means 0
	}
	motorBike(int speed){
		this.speed = speed;
		System.out.println("This speed of the motorbike is : " + this.speed);
	}
	
}
