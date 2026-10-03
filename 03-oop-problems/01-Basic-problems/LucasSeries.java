// Question:
// Write a Java program to print Lucas series up to 10.

public class LucasSeries {

    public static void main(String[] args) {

        int first = 2;
        int second = 1;

        while (first <= 10) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}