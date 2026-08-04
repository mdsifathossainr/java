class Student {
    String name;
    int roll;
    double gpa;

    void setInformation(String n, int r, double g) {
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

public class ParameterizedMethod {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setInformation("Mahir", 10, 3.80);
        s1.displayInformation();

        Student s2 = new Student();
        s2.setInformation("Meharab", 5, 3.91);
        s2.displayInformation();

    }
}
