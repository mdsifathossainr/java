// Write a program to find the largest among three numbers using nested if-else.

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers : ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largestNumber = 0;

        if (a > b) {
            if (a > c)
                largestNumber = a;
            else
                largestNumber = c;
        } else {
            if (b > c)
                largestNumber = b;
            else
                largestNumber = c;
        }

        System.out.println("Largest Number : " + largestNumber);
    }
}