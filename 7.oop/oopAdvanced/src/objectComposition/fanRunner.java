package objectComposition;

public class fanRunner {
	public static void main(String[] args) {
//		String name,int number,String color,String maker
		fan newFan = new fan("Honda",100,"GREEN","Toyota");
//		newFan.onOrOff(true);
		newFan.switchOn();
		System.out.println(newFan);
		newFan.switchOff();
		System.out.println(newFan);
		newFan.setSpeed((byte)100);
		System.out.println(newFan);
	}

}
