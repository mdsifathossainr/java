// Alphabet Palindrome Diamond 2
// Input: 5
// Output:
//     A
//    BAB
//   CBABC
//  DCBABCD
// EDCBABCDE
//  DCBABCD
//   CBABC
//    BAB
//     A

import java.util.Scanner;

public class AlphabetPalindromeDiamond2 {

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

            // Print decreasing alphabets
            for (int j = num; j >= 1; j--) {
                System.out.print((char) ('A' + j - 1));
            }

            // Print increasing alphabets
            for (int j = 2; j <= num; j++) {
                System.out.print((char) ('A' + j - 1));
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