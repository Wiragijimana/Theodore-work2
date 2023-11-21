// Parent class
class Vehicle {
    // Method in the parent class
    void start() {
        System.out.println("Vehicle is starting");
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    // Additional method in the child class
    void drive() {
        System.out.println("Car is driving");
    }
}

 class single2 {
    public static void main(String[] args) {
        // Creating an object of the child class
        Car myCar = new Car();

        // Calling methods from the parent class
        myCar.start();

        // Calling method from the child class
        myCar.drive();
    }
}
