class Student {

    String name, gender;
    int roll;
    double gpa;

}

public class ClassAndObject {
    public static void main(String[] args) {
        Student s1;                  // Object declaration
        s1 = new Student();          // Object creation

        Student s2 = new Student();  // Object declaration and creation

        s1.name = "Mahir";
        s1.gender = "Male";
        s1.roll = 10;
        s1.gpa = 3.80;

        s2.name = "Meharab";
        s2.gender = "Male";
        s2.roll = 5;
        s2.gpa = 3.91;

        System.out.println("Name : " + s1.name);
        System.out.println("Gender : " + s1.gender);
        System.out.println("Roll : " + s1.roll);
        System.out.println("Gpa : " + s1.gpa);

        System.out.println();

        System.out.println("Name : " + s2.name);
        System.out.println("Gender : " + s2.gender);
        System.out.println("Roll : " + s2.roll);
        System.out.println("Gpa : " + s2.gpa);

    }
}
