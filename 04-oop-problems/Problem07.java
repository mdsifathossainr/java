// Write a Java program to create a class known as Person with methods called
// getFirstName() and getLastName(). Create a subclass called Employee that adds
// a new method named getEmployeeId() and overrides the getLastName() method to
// include the employee's job title.

class Person {
    String firstName;
    String lastName;

    void getFirstName() {
        System.out.println("First Name : " + firstName);
    }

    void getLastName() {
        System.out.println("Last Name : " + lastName);
    }
}

class Employee extends Person {
    int employeeId;
    String jobTitle;

    void getEmployeeId() {
        System.out.println("Employee ID : " + employeeId);
    }

    @Override
    void getLastName() {
        System.out.println("Last Name : " + lastName + " (" + jobTitle + ")");
    }
}

public class Problem07 {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.firstName = "Sifat";
        e.lastName = "Hossain";
        e.employeeId = 101;
        e.jobTitle = "Software Developer";

        e.getFirstName();
        e.getLastName();
        e.getEmployeeId();
    }
}