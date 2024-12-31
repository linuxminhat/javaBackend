package super_keyword;

class Animal {
	Animal(String name) {
        System.out.println("Animal is created with name: " + name);
    }
}

class Dog extends Animal {
    Dog() {
        super("Buddy"); // Call constructor in class Animal with parameter "Buddy"
        System.out.println("Dog is created");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}