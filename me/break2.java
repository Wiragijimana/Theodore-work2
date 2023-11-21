import java.util.ArrayList;

class Car {
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

class Break2 {

    public static void main(String[] args) {
        // Create a list of Car objects
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota Camry", 2020));
        carList.add(new Car("Honda Accord", 2019));
        carList.add(new Car("Ford Mustang", 2021));
        carList.add(new Car("Chevrolet Malibu", 2020));

        // Call the method that uses the break statement
        findCar(carList, "Ford Mustang");
    }

    // Method that uses a break statement with an object
    public static void findCar(ArrayList<Car> cars, String targetModel) {
        for (Car car : cars) {
            // Check if the current car's model matches the target model
            if (car.model.equals(targetModel)) {
                System.out.println("Car found: " + car.model + " (Year: " + car.year + ")");
                // Use break statement to exit the loop once the car is found
                break;
            }
        }
    }
}
