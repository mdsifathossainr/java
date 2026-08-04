class Student {

    String name;
    int roll;
    double gpa;

    Student() {
        System.out.println("No Information\n");
    }

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

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

public class ConstructorOverloading {
    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student("Mahir", 10);
        s2.displayInformation();

        Student s3 = new Student("Meharab", 5, 3.91);
        s3.displayInformation();

    }
}