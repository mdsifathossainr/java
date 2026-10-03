// Question:
// Write a Java program to print all Fibonacci numbers less than
// or equal to 10.

public class FibonacciNumbers {

    public static void main(String[] args) {

        int first = 0;
        int second = 1;

        while (first <= 10) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }
}