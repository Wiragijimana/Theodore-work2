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
class ColoredCircle extends Circle {
    void setColor(String color) {
        System.out.println("Setting color to " + color);
    }
}

// Main class
public class mult2 {
    public static void main(String[] args) {
        // Creating an instance of the base class
        Shape shape = new Shape();
        shape.draw();

        // Creating an instance of the first derived class
        Circle circle = new Circle();
        circle.draw();
        circle.drawCircle();

        // Creating an instance of the second derived class
        ColoredCircle coloredCircle = new ColoredCircle();
        coloredCircle.draw();
        coloredCircle.drawCircle();
        coloredCircle.setColor("Red");
    }
}
