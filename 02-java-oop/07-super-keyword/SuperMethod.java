class A {
     
   void display()
   {
       System.out.println("Inside A class");
   }
    
}
class B extends A{
 
   
    void display()
    {
        super.display();
        System.out.println("Inside B class");
    }

}
public class SuperMethod {
    public static void main(String[]args)
    {
        B obj = new B();
        obj.display();
    }
}
