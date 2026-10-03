// Number Palindrome Diamond
// Input: 5
// Output:
//     1
//    121
//   12321
//  1234321
// 123454321
//  1234321
//   12321
//    121
//     1

import java.util.Scanner;

public class NumberPalindromeDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 2 * n - 1;
        int space = n - 1;
        int num = 1;

        for (int i = 1; i <= a; i++) {

            // Print spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // Print increasing numbers
            for (int j = 1; j <= num; j++) {
                System.out.print(j);
            }

            // Print decreasing numbers
            for (int j = num - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();

            // Increase numbers in upper half
            if (i <= a / 2) {
                space--;
                num++;
            }
            // Decrease numbers in lower half
            else {
                space++;
                num--;
            }
        }

        sc.close();
    }
}