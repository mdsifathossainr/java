package basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter an integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter a double: ");
        double num2 = sc.nextDouble();

        System.out.println("Hello " + name);
        System.out.println("Sum: " + (num1 + num2));

        sc.close();
    }
}