// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Derived class 2
class Labrador extends Dog {
    void color() {
        System.out.println("Labrador is brown");
    }
}

// Main class
class mult1 {
    public static void main(String[] args) {
        // Creating an instance of the base class
        Animal animal = new Animal();
        animal.eat();

        // Creating an instance of the first derived class
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        // Creating an instance of the second derived class
        Labrador labrador = new Labrador();
        labrador.eat();
        labrador.bark();
        labrador.color();
    }
}
