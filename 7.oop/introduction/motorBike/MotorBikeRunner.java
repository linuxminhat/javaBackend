package motorBike;
//This class for running motorbike 
public class MotorBikeRunner {
	public static void main(String[] args) {
		MotorBike honda = new MotorBike();
		MotorBike lexus = new MotorBike();
		honda.start();
		lexus.start();
	}
}
