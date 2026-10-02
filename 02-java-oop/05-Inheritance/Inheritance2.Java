class Person {
    private String name;
    private String department;

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }
    public String getDepartment()
    {
        return department;
    }
}

class Student extends Person {

   private int id;
   
   public void setId(int id)
   {
     this.id = id;
   }

   public int getId()
   {
    return id;
   }
   void displayInformation()
   {
      System.out.println("Name : "+getName());
      System.out.println("Department : " + getDepartment());
      System.out.println("ID : " + getId());
      System.out.println("\n");
   }
}

public class Inheritance2 {
    public static void main(String[]args)
    {
        Student s1 = new Student();

        s1.setName("Sifat");
        s1.setDepartment("CSE");
        s1.setId(63);

        s1.displayInformation();


        Student s2 = new Student();

        s2.setName("Radoan");
        s2.setDepartment("CSE");
        s2.setId(12);

        s2.displayInformation();
    }
}
