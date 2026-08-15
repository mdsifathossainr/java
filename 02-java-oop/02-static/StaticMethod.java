class Student {

    void showStudentInfo() {
        System.out.println("I am a student.");
    }

    static void showUniversityName() {
        System.out.println("My university is Patuakhali Science and Technology University.");
    }
}

public class StaticMethod {

    public static void main(String[] args) {

        // Calling non-static method
        Student student = new Student();
        student.showStudentInfo();

        // Calling static method
        Student.showUniversityName();
    }
}