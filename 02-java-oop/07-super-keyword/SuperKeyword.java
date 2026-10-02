class Vehicle {
     String color;
     double weight;

     Vehicle(String color , double weight)
     {
        this.color = color;
        this.weight = weight;
     }

     void attribute(){
        System.out.println("Color : "+color);
        System.out.println("Weight : " + weight);
     }
   
}
class Car extends Vehicle{
     
    double speed;

    Car(String color , double weight , double speed)
    {
        super(color , weight);
        this.speed = speed;
    }

    void attribute()
    {
      super.attribute();
      System.out.println("Speed : "+speed);
    }

}
public class SuperKeyword   {
    public static void main(String[]args)
    {
        Car c = new Car("Black",1500 , 180);
        c.attribute();
    }
}
