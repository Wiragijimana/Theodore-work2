// Base class
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Derived class 1
class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a circle");
    }
}

// Derived class 2
class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing a rectangle");
    }
}

// Main class
public class hiera1 {
    public static void main(String[] args) {
        // Creating an instance of the base class
        Shape shape = new Shape();
        shape.draw();

        // Creating an instance of the first derived class
        Circle circle = new Circle();
        circle.draw();
        circle.drawCircle();

        // Creating an instance of the second derived class
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.drawRectangle();
    }
}
