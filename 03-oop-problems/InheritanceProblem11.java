// Question:
// Write a Java program that defines a class named Rectangle
// with two data members: length and breadth. Include a constructor
// that initializes these values and methods to calculate and display
// the rectangle's area and perimeter.
//
// Next, create a subclass named Square whose constructor accepts
// a single value (side) and calls the parent constructor using
// super(side, side).
//
// Finally, create objects of both classes and display their
// areas and perimeters.

class Rectangle {
    double length;
    double breadth;

    // Constructor
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Calculate and display area
    void displayArea() {
        double area = length * breadth;
        System.out.println("Area: " + area);
    }

    // Calculate and display perimeter
    void displayPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter: " + perimeter);
    }
}

// Square is a subclass of Rectangle
class Square extends Rectangle {

    // Constructor
    Square(double side) {
        super(side, side);
    }
}

public class InheritanceProblem11 {
    public static void main(String[] args) {

        // Create Rectangle object
        Rectangle r = new Rectangle(10, 5);

        System.out.println("Rectangle:");
        r.displayArea();
        r.displayPerimeter();

        // Create Square object
        Square s = new Square(4);

        System.out.println("\nSquare:");
        s.displayArea();
        s.displayPerimeter();
    }
}