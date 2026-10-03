// Demonstration of a static blank final variable in Java

class University {

    // A final variable cannot be changed after it is assigned.
    final String UNIVERSITY_NAME = "PSTU";

    // Static blank final variable
    static final int STUDENT_ID;

    // Static block
    static {
        STUDENT_ID = 101;
    }
}

public class StaticBlankFinalVariable {

    public static void main(String[] args) {

        University obj = new University();

        // Display the university name
        System.out.println("University : " + obj.UNIVERSITY_NAME);

        // Display the student ID
        System.out.println("Student ID : " + University.STUDENT_ID);
    }
}