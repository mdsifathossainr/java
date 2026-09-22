// Input: 4
// Output:
// 1
// 13
// 135
// 1357

import java.util.Scanner;

public class OddNumberTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a;

        for (int i = 1; i <= n; i++) {
            a = 1;
            for (int j = 1; j<=i; j++) {
                System.out.print(a);
                a+=2;
            }
            System.out.println();
        }
    }
}