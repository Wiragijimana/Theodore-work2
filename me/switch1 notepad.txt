 class Switch1 {

    public static void main(String[] args) {
        // Example with switch statement and method
        String dayName = "Wednesday";
        int dayOfWeek = getDayOfWeek(dayName);
        String dayType = getDayType(dayOfWeek);

        switch (dayType) {
            case "Weekday":
                System.out.println("It's a weekday.");
                break;
            case "Weekend":
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("Invalid day type.");
        }

        // Example with switch statement and object
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

    // Method to convert day name to day of week (1-7)
    private static int getDayOfWeek(String dayName) {
        switch (dayName.toLowerCase()) {
            case "sunday":
                return 1;
            case "monday":
                return 2;
            case "tuesday":
                return 3;
            case "wednesday":
                return 4;
            case "thursday":
                return 5;
            case "friday":
                return 6;
            case "saturday":
                return 7;
            default:
                return -1; // Invalid day name
        }
    }

    // Method to determine the day type (Weekday or Weekend)
    private static String getDayType(int dayOfWeek) {
        switch (dayOfWeek) {
            case 1:
            case 7:
                return "Weekend";
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return "Weekday";
            default:
                return "Invalid";
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
