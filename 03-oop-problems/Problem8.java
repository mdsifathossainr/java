//Write a Java program to create a class called Shape with methods called getPerimeter() 
//and getArea(). Create a subclass called Circle that overrides the getPerimeter() and 
//getArea() methods to calculate the area and perimeter of a circle.

class Shape {

    double area;
    double perimeter;

    void getPerimeter() {
        System.out.println("Perimeter of shape");
    }

    void getArea() {
        System.out.println("Area of shape");
    }
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void getArea() {
        area = Math.PI * radius * radius;
        System.out.printf("Area : %.2f%n", area);
    }

    @Override
    void getPerimeter() {
        perimeter = 2 * Math.PI * radius;
        System.out.printf("Perimeter : %.2f%n", perimeter);
    }
}

public class Problem8 {
    public static void main(String[] args) {

        Circle c = new Circle(5);

        c.getArea();
        c.getPerimeter();
    }
}