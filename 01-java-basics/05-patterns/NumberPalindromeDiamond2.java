// Number Palindrome Diamond 2
// Input: 5
// Output:
//     1
//    212
//   32123
//  4321234
// 543212345
//  4321234
//   32123
//    212
//     1

import java.util.Scanner;

public class NumberPalindromeDiamond2 {

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

            // Print decreasing numbers
            for (int j = num; j >= 1; j--) {
                System.out.print(j);
            }

            // Print increasing numbers
            for (int j = 2; j <= num; j++) {
                System.out.print(j);
            }

            System.out.println();

            // Increase in upper half
            if (i <= a / 2) {
                space--;
                num++;
            }
            // Decrease in lower half
            else {
                space++;
                num--;
            }
        }

        sc.close();
    }
}