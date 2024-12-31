package motorBike_setandget_exception;

public class motorBike {
	int speed;
	void setSpeed(int speed) {
		if (speed >0) {
		this.speed = speed;
		System.out.println("The speed of this motor bike is " + speed);
		} else 
		{
			System.out.println("The speed is not available");
		}
	}
	
	void startRunning() {
		System.out.println("This motor bike is start running");
	}
	int stopRunning(int speed) {
		this.speed = speed;
		return 0;
	}
}
