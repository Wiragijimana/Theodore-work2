// Define an interface with a method
interface Printable {
    void print();  // Abstract method
}

// Implement the interface in a class
class Printer implements Printable {
    @Override
    public void print() {
        System.out.println("Printing from Printer class");
    }
}

 class Interface1 {
    public static void main(String[] args) {
        // Create an object of the class that implements the interface
        Printable printer = new Printer();

        // Call the method using the interface reference
        printer.print();
    }
}
