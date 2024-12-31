package abstractclass;

abstract class animal {
	public void bark() {
		System.out.println();
	}


}
class Dog extends abstractAnimal{
	public void bark() {
		System.out.println("Dog is barking");
	}
}
public class abstractAnimal{
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.bark();
	}
}

