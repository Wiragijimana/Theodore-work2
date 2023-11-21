// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class 1
class Lion extends Animal {
    void roar() {
        System.out.println("Lion is roaring");
    }
}

// Derived class 2
class Elephant extends Animal {
    void trumpet() {
        System.out.println("Elephant is trumpeting");
    }
}

// Main class
public class hiera2 {
    public static void main(String[] args) {
        // Creating an instance of the base class
        Animal animal = new Animal();
        animal.eat();

        // Creating an instance of the first derived class
        Lion lion = new Lion();
        lion.eat();
        lion.roar();

        // Creating an instance of the second derived class
        Elephant elephant = new Elephant();
        elephant.eat();
        elephant.trumpet();
    }
}
