package abstractClass;

abstract class Animal{
	//declare abstract function
	public void bark() {
	}
}
class Dog extends Animal{
	public void bark() {
		System.out.println("Dog is barking");
	}
}
public class abstractAnimal {
	public static void main(String[] args) {
//		Animal animal1 = new Animal();
		Dog dog1 = new Dog();
		dog1.bark();
	}

}
