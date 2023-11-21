
import java.util.ArrayList;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

 class Break1 {

    public static void main(String[] args) {
        // Create a list of Student objects
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice", 20));
        studentList.add(new Student("Bob", 22));
        studentList.add(new Student("Charlie", 18));
        studentList.add(new Student("David", 25));

        // Call the method that uses the break statement
        findStudent(studentList, "Charlie");
    }

    // Method that uses a break statement with an object
    public static void findStudent(ArrayList<Student> students, String targetName) {
        for (Student student : students) {
            // Check if the current student's name matches the target name
            if (student.name.equals(targetName)) {
                System.out.println("Student found: " + student.name + " (Age: " + student.age + ")");
                // Use break statement to exit the loop once the student is found
                break;
            }
        }
    }
}
