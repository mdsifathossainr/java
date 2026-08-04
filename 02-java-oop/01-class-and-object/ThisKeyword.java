class Student {
    String name;
    int roll;
    double gpa;

    Student(String name, int roll, double gpa) {

        this.name = name;
        this.roll = roll;
        this.gpa = gpa;

    }

    void displayInformation() {
        System.out.println("Name : " + name);
        System.out.println("Roll : " + roll);
        System.out.println("Gpa : " + gpa);
        System.out.println();
    }
}

public class ThisKeyword {
    public static void main(String[] args) {

        Student s1 = new Student("Mahir", 10, 3.80);
        s1.displayInformation();

        Student s2 = new Student("Meharab", 5, 3.91);
        s2.displayInformation();

    }
}
