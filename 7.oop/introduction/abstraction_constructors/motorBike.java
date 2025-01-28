package abstraction_constructors;

public class motorBike {
	int speed;
	double numbOfCategory;
	motorBike(int firstSpeed){
		this.speed = firstSpeed;
	}
//	motorBike(double numbOfCategory){
//		this.numbOfCategory = numbOfCategory;
//	}
	void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("the speed of this car" + this.speed);
	}
	int getSpeed() {
		this.speed = speed;
		return this.speed;
	}
	void startRunning() {
		System.out.println("the motorbike is start running");
	}
	void stopRunning() {
		System.out.println("the motorbike is stop running");
	}
	 
}
