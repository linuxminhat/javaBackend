package car_getandset;

public class carRunner {
	public static void main(String[] args) {
		car bmw = new car();
		bmw.setSpeed(100);
		bmw.carSpeedUp(100);
		bmw.carSpeedDown(150);
		bmw.carStart();
	}
	
	

}
