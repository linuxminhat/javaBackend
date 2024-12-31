package car_getandset;

public class car {
	double speed;
	boolean available;
	void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("The speed of this car is " + speed);
	}
	double getSpeed() {
		return speed;
	}
	void carStart() {
		System.out.println("Car start running");
	}
	void carSpeedUp(double firstSpeed) {
		this.speed = firstSpeed;	
		System.out.println("The carSpeedUp " + (this.speed + 30));
	}
	void carSpeedDown(double firstSpeed) {
		this.speed = firstSpeed;	
		System.out.println("The carSpeedDown " + (this.speed - 5));
	}
	void carStop() {
		System.out.println("Car stop running");
	}

}
