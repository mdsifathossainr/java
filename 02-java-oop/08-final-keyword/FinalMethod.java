class University {

    // A final method can be inherited but cannot be overridden.
    final void display() {
        System.out.println("University Information");
    }
}

class Student extends University {

    // display() is inherited but cannot be overridden
    // because it is declared as final in the University class.

    // Student has its own separate method
    void display2() {
        System.out.println("Student Information");
    }
}

public class FinalMethod {

    public static void main(String[] args) {

        // Create an object of Student
        Student s1 = new Student();

        // Call the inherited final method
        s1.display();

        // Call Student's own method
        s1.display2();
    }
}