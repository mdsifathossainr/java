class University {

    // final means the variable's value cannot be changed after it is assigned.
    final String UNIVERSITY_NAME = "PSTU";

    final int STUDENT_ID; // Blank final variable

    // Constructor
    University() {
        STUDENT_ID = 101;
    }
}

public class BlankFinalVariable {

    public static void main(String[] args) {

        University obj = new University();

        System.out.println("University : " + obj.UNIVERSITY_NAME);
        System.out.println("Student ID : " + obj.STUDENT_ID);
    }
}