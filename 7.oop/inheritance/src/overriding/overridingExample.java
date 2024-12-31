package overriding;

class Vehicle{
	public void run() {
		System.out.println("Vehicle is running");
	}
}
class Car extends Vehicle {
	public void run() {
		System.out.println("Car is running");
	}
}
public class overridingExample {
	public static void main(String[] args) {
		Car honda = new Car();
		honda.run();
		
	}

}
