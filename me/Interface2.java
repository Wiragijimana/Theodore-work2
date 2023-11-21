// Define a simple interface with a method
interface MyInterface {
    void myMethod();  // Abstract method
}

// Implement the interface in a class
class MyClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Executing myMethod in MyClass");
    }
}

 class Interface2 {
    public static void main(String[] args) {
        // Create an object of the class that implements the interface
        MyInterface myObject = new MyClass();

        // Call the method using the interface reference
        myObject.myMethod();
    }
}
