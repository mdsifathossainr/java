class A {
     
   A()
   {
      System.out.println("A's constructor");
   }
    
}
class B extends A{
     
    B()
    {
        super();
        System.out.println("B's Constructor");
    }

}
public class SuperConstructor {
    public static void main(String[]args)
    {
        B obj = new B();
    }
}
