package motorBike_setandget_exception;

public class motorBikeRunner {
	public static void main(String[] args) {
		motorBike honda = new motorBike();
		honda.setSpeed(-5);
		honda.setSpeed(90);
	}
}
