// Parent class
class Animal {
    // Method in the parent class
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    // Additional method in the child class
    void bark() {
        System.out.println("Dog is barking");
    }
}

class single1 {
    public static void main(String[] args) {
        // Creating an object of the child class
        Dog myDog = new Dog();

        // Calling methods from the parent class
        myDog.eat();

        // Calling method from the child class
        myDog.bark();
    }
}
