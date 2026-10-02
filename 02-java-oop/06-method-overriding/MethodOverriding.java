class Person{
    String name;
    int age;

    void displayInformation()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : " +age);
    }
}
class Student extends Person{
    int id ;

    @Override 
    void displayInformation()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("ID : "+id);
    }
}

public class MethodOverriding {
    public static void main(String[]args)
    {
        Student s1 = new Student();
        s1.name = "Mahir";
        s1.age = 21;
        s1.id = 1;
        s1.displayInformation();


        Person p1 = new Person();
        p1.name = "Rakib";
        p1.age = 24;
        p1.displayInformation();
    }
}
