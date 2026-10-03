// Question:
// Write a Java program to print all perfect numbers up to a
// given limit using a class, object, constructor, and encapsulation.
// A perfect number is a number equal to the sum of its proper divisors.
// Example: 6 = 1 + 2 + 3.

import java.util.Scanner;

class Perfect {

    private int limit;

    // Constructor
    public Perfect(int limit) {
        this.limit = limit;
    }

    // Find and display perfect numbers
    void findPerfectNumbers() {

        for (int i = 1; i <= limit; i++) {

            int sum = 0;

            for (int j = 1; j < i; j++) {

                if (i % j == 0) {
                    sum = sum + j;
                }
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}

public class PerfectNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Number: ");
        int num = sc.nextInt();

        Perfect p = new Perfect(num);
        p.findPerfectNumbers();

        sc.close();
    }
}