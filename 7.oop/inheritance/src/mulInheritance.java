class Animal{
	public Animal() {
		System.out.println("Animal is Running");
	}
}
class Pet extends Animal{
	public Pet() {
		System.out.println("Pet is Running");
	}
}
class Dog extends Pet{
	public Dog() {
		System.out.println("Dog is Running");
	}
}
public class mulInheritance {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		 
	}

}
