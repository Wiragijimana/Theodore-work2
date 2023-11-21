 class Switch2 {

    public static void main(String[] args) {
        // Example: Switch statement with object
        Shape shape = new Shape("Circle");

        switch (shape.getType().toLowerCase()) {
            case "circle":
                System.out.println("This is a circle.");
                break;
            case "square":
                System.out.println("This is a square.");
                break;
            case "triangle":
                System.out.println("This is a triangle.");
                break;
            default:
                System.out.println("Unknown shape.");
        }
    }
}

class Shape {
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}