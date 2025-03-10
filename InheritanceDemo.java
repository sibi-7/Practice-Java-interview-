class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // create an object
        myDog.makeSound(); // Inherited method
        myDog.bark(); // Dog's own method
    }
}
