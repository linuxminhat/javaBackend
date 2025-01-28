package motorBike_setandget_advanced2;

public class motorBike {
	int speed;
	void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("The speed of motorbike is "+this.speed);
	}
	int getSpeed() {
		return speed;
	}
	void speedUp(int howmuch) {
		this.speed = this.speed + howmuch;
		System.out.println(this.speed);
	}
	int speedDown(int howmuch) {
		return this.speed = this.speed - howmuch;
	}
	void startRunning() {
		System.out.println("The motorbike is start running");
	}
	void stopRunning() {
		System.out.println("The motorbike is stop running");
	}
	

}
