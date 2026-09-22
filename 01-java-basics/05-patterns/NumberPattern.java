// Input: 4
// Output:
// 1234
// 1234
// 1234
// 1234

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a;

        for (int i = 1; i <= n; i++) {
            a = 1;
            for (int j = 1; j <= n; j++) {
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}