package motorBikePractice;

public class motorBikeRunner {
	public static void main(String[] args) {
		motorBike honda = new motorBike();
		motorBike dream = new motorBike();
		honda.motorBikeStart();
		dream.motorBikeStart();
		//declare speed of honda and dream at first 
		honda.speed = 100;
		dream.speed = 80;
		//declare speed of honda and dream after 
		honda.speed = 50;
		dream.speed = 30;
		
	}

}
