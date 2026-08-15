class Overload
{
    void add(int a , int b)
    {
        System.out.println(a+b);
    }
    void add(double a , double b)
    {
        System.out.println(a+b);
    }
    void add(int a , int b , int c)
    {
        System.out.println(a+b+c);
    }
    void add()
    {
        System.out.println("Nothing to add");
    }
}
public class MethodOverloading {
    public static void main(String[]args)
    {

       Overload obj = new Overload();
       obj.add();
       obj.add(5,10);
       obj.add(5.5 , 10.6);
       obj.add(10,5,15);

    }
}

