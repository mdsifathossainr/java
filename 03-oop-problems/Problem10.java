// Write a Java program that creates a class hierarchy for employees of a company.
// The base class should be Employee, with subclasses Manager, Developer, and Programmer.
// Each subclass should have properties such as name, address, salary, and job title.
// Implement methods for calculating bonuses, generating performance reports, and
// managing projects.

class Employee {

    String name;
    String address;
    double salary;
    String jobTitle;

    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    double calculateBonus() {
        return salary * 0.05;
    }

    void generatePerformanceReport() {
        System.out.println(name + " is working as " + jobTitle);
    }

    void manageProject() {
        System.out.println(name + " is working on a project");
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Salary : " + salary);
        System.out.println("Job Title : " + jobTitle);
        System.out.printf("Bonus : %.2f%n", calculateBonus());
        generatePerformanceReport();
        manageProject();
    }
}

class Manager extends Employee {

    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    double calculateBonus() {
        return salary * 0.20;
    }

    @Override
    void generatePerformanceReport() {
        System.out.println(name + " manages the team");
    }

    @Override
    void manageProject() {
        System.out.println(name + " manages the project");
    }
}

class Developer extends Employee {

    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    double calculateBonus() {
        return salary * 0.15;
    }

    @Override
    void generatePerformanceReport() {
        System.out.println(name + " develops software");
    }

    @Override
    void manageProject() {
        System.out.println(name + " develops project features");
    }
}

class Programmer extends Employee {

    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    double calculateBonus() {
        return salary * 0.10;
    }

    @Override
    void generatePerformanceReport() {
        System.out.println(name + " writes and tests code");
    }

    @Override
    void manageProject() {
        System.out.println(name + " completes programming tasks");
    }
}

public class Problem10 {
    public static void main(String[] args) {

        Manager manager = new Manager("Sakib", "Dhaka", 60000);
        Developer developer = new Developer("Mahir", "Chittagong", 50000);
        Programmer programmer = new Programmer("Rakib", "Patuakhali", 40000);

        System.out.println("----- Manager -----");
        manager.display();

        System.out.println("\n----- Developer -----");
        developer.display();

        System.out.println("\n----- Programmer -----");
        programmer.display();
    }
}