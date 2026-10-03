// Question:
// Write a Java program to check whether a number is a Strong Number
// using a class, object, constructor, and encapsulation.
// A Strong Number is a number equal to the sum of the factorials
// of its digits.
// Example: 145 = 1! + 4! + 5! = 145.

import java.util.Scanner;

class Strong {

    private int num;

    public Strong(int num) {
        this.num = num;
    }

    void isStrong() {

        int temp = num;
        int rem = 0;
        int sum = 0;
        int fec;

        while (temp != 0) {

            rem = temp % 10;
            fec = 1;

            for (int i = 1; i <= rem; i++) {
                fec = fec * i;
            }

            sum = sum + fec;
            temp = temp / 10;
        }

        if (sum == num)
            System.out.println("It is a Strong Number");
        else
            System.out.println("It is not a Strong Number");
    }
}

public class StrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        Strong s = new Strong(num);
        s.isStrong();

        sc.close();
    }
}