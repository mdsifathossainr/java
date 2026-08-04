class Student {

    String name;
    int roll;
    double gpa;

    Student(String n, int r, double g) {

        name = n;
        roll = r;
        gpa = g;

    }

    void displayInformation() {
        System.out.println("Name : " + name);
        System.out.println("Roll : " + roll);
        System.out.println("Gpa : " + gpa);
        System.out.println();
    }
}

public class Constructor {
    public static void main(String[] args) {

        Student s1 = new Student("Mahir", 10, 3.80);
        s1.displayInformation();

        Student s2 = new Student("Meharab", 5, 3.91);
        s2.displayInformation();

    }
}
