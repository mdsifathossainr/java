import java.util.Scanner;

class GeometryCalculator {

    void calculateCircle(double radius) {
        System.out.println("Area : " + (Math.PI * radius * radius));
        System.out.println("Perimeter : " + (2 * Math.PI * radius));
    }

    void calculateTriangle(double base, double height, double side1, double side2, double side3) {

        System.out.println("Area : " + (0.5 * base * height));
        System.out.println("Perimeter : " + (side1 + side2 + side3));
    }

    void calculateSquare(double side) {
        System.out.println("Area : " + (side * side));
        System.out.println("Perimeter : " + (4 * side));
    }

    void calculateRectangle(double length, double width) {
        System.out.println("Area : " + (length * width));
        System.out.println("Perimeter : " + (2 * (length + width)));
    }

    void calculateParallelogram(double base, double side, double height) {
        System.out.println("Area : " + (base * height));
        System.out.println("Perimeter : " + (2 * (base + side)));
    }

    void calculateRhombus(double firstDiagonal, double secondDiagonal, double side) {
        System.out.println("Area : " + (0.5 * firstDiagonal * secondDiagonal));
        System.out.println("Perimeter : " + (4 * side));
    }
}

public class AreaAndPerimeter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GeometryCalculator calculator = new GeometryCalculator();

        System.out.print("Enter Geometry name : ");
        String geometryName = scanner.nextLine().toLowerCase();

        if (geometryName.equals("circle")) {

            System.out.print("Enter radius : ");
            double radius = scanner.nextDouble();

            calculator.calculateCircle(radius);

        } 
        else if (geometryName.equals("triangle")) {

            System.out.print("Enter base : ");
            double base = scanner.nextDouble();

            System.out.print("Enter height : ");
            double height = scanner.nextDouble();

            System.out.print("Enter first side : ");
            double side1 = scanner.nextDouble();

            System.out.print("Enter second side : ");
            double side2 = scanner.nextDouble();

            System.out.print("Enter third side : ");
            double side3 = scanner.nextDouble();

            calculator.calculateTriangle(base, height, side1, side2, side3);

        } 
        else if (geometryName.equals("square")) {

            System.out.print("Enter side : ");
            double side = scanner.nextDouble();

            calculator.calculateSquare(side);

        } 
        else if (geometryName.equals("rectangle")) {

            System.out.print("Enter length : ");
            double length = scanner.nextDouble();

            System.out.print("Enter width : ");
            double width = scanner.nextDouble();

            calculator.calculateRectangle(length, width);

        } 
        else if (geometryName.equals("parallelogram")) {

            System.out.print("Enter base : ");
            double base = scanner.nextDouble();

            System.out.print("Enter side : ");
            double side = scanner.nextDouble();

            System.out.print("Enter height : ");
            double height = scanner.nextDouble();

            calculator.calculateParallelogram(base, side, height);

        } 
        else if (geometryName.equals("rhombus")) {

            System.out.print("Enter first diagonal : ");
            double firstDiagonal = scanner.nextDouble();

            System.out.print("Enter second diagonal : ");
            double secondDiagonal = scanner.nextDouble();

            System.out.print("Enter side : ");
            double side = scanner.nextDouble();

            calculator.calculateRhombus(firstDiagonal, secondDiagonal, side);

        } 
        else {

            System.out.println("Invalid input");
        }

        scanner.close();
    }
}