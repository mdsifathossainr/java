// Write a Java program to create a class called Employee with methods called work() and 
// getSalary(). Create a subclass called HRManager that overrides the work() method and 
// adds a new method called addEmployee(). 

class Employee {

    void work() {
        System.out.println("Employee working");
    }

    void getSalary() {
        System.out.println("Employee get salary");
    }
}

class HRManager extends Employee {

    @Override
    void work() {
        System.out.println("HRManager working");
    }

    void addEmployee() {
        System.out.println("HRManager add employee");
    }
}

public class Problem4 {
    public static void main(String[] args) {

        HRManager hr = new HRManager();

        hr.work();
        hr.getSalary();
        hr.addEmployee();
    }
}