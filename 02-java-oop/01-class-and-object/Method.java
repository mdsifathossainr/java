class Student {
    String name, gender;
    int roll;
    double gpa;

    void displayInformation() {
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Roll : " + roll);
        System.out.println("Gpa : " + gpa);
        System.out.println();
    }
}

public class Method {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Mahir";
        s1.gender = "Male";
        s1.roll = 10;
        s1.gpa = 3.80;
        s1.displayInformation();

        Student s2 = new Student();
        s2.name = "Meharab";
        s2.gender = "Male";
        s2.roll = 5;
        s2.gpa = 3.91;
        s2.displayInformation();

    }
}
