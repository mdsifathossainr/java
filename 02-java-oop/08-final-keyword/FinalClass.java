// A final class cannot be inherited.
final class University {

    void display() {
        System.out.println("University Information");
    }
}

public class FinalClass {

    public static void main(String[] args) {

        // Create an object of the final class
        University u1 = new University();

        // Call the method of the final class
        u1.display();
    }
}