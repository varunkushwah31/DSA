package Inheritance;

abstract class Animal {
    // Abstract method (no implementation)
    public abstract void makeSound();
    // Concrete method
    public void displayInfo() {
        System.out.println("This is an animal.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call base class method
        System.out.println("Specifically, it is a dog.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call base class method
        System.out.println("Specifically, it is a cat.");
    }
}

public class AnimalProperty {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat() };

        for (Animal animal : animals) {
            animal.displayInfo();  // Polymorphic call
            animal.makeSound();    // Polymorphic call
            System.out.println();
        }
    }
}
