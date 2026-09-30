// Write a Java program to solve quadratic equations (use if, else if and else).
// Test Data
// Input a: 1
// Input b: 5
// Input c: 1

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = sc.nextDouble();

        System.out.print("Input b: ");
        double b = sc.nextDouble();

        System.out.print("Input c: ");
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("This is not a quadratic equation.");

        } else if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Two real roots:");
            System.out.println("r1 = " + r1);
            System.out.println("r2 = " + r2);

        } else if (d == 0) {
            double r = -b / (2 * a);

            System.out.println("One real root:");
            System.out.println("r = " + r);

        } else {
            System.out.println("No real roots.");
        }

        sc.close();
    }
}