//Write a Java program to create a class called Shape with a method called getArea(). 
//Create a subclass called Rectangle that overrides the getArea() method to calculate the 
//area of a rectangle. 

class Shape {

    void getArea() {
        System.out.println("Area of shape");
    }
}

class Rectangle extends Shape {

    double width;
    double length;

    Rectangle(double width , double length)
    {
        this.width = width;
        this.length = length;
    }

    @Override
    void getArea() {
         double area = width * length;
         System.out.println("Area : " + area);
    }
}

public class Problem03 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        r.getArea();
    }
}