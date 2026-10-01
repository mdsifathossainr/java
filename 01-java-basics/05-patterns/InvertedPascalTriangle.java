// Inverted Pascal's Triangle
// Input: 5
// Output:
// 1 4 6 4 1
//  1 3 3 1
//   1 2 1
//    1 1
//     1

import java.util.Scanner;

public class InvertedPascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = n - 1; i >= 0; i--) {
            int num = 1;

            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // Print Pascal numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }

        sc.close();
    }
}
