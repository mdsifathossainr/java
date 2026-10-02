class Person {
    String name;
    String department;

    void displayInformation1() {
        System.out.println("Name : " + name);
        System.out.println("Department : " + department);
    }
}

class Student extends Person {

    int id;

    void displayInformation2() {
        displayInformation1();
        System.out.println("Id : " + id);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sifat";
        s1.department = "CSE";
        s1.id = 63;

        s1.displayInformation2();
    }
}