class Student{
   
    String name;
    int id;
    static String universityName = "PSTU";

    Student(String name , int id)
    {
        this.name = name;
        this.id = id;
    }

    void displayInformation()
    {
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("University : "+universityName);
        System.out.println();
    }
}
public class StaticVariable{
    public static void main(String[]args)
    {
        Student s1 = new Student("Sifat" , 10);
        Student s2 = new Student("Tanvir" , 5);

        s1.displayInformation();
        s2.displayInformation();
    }
}