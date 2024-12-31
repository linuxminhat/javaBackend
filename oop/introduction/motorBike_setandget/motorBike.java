package motorBike_setandget;

public class motorBike {
	//declare attributes 
	int speed;
	void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("The speed of motorbike is" + this.speed);
	}
	//declare behavior
	void startRunning() {
		System.out.println("Motor Bike is start running");
	}

}
