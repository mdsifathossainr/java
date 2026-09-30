// Input: 4
// Output:
// 1
// 01
// 101
// 0101

import java.util.Scanner;

public class BinaryTrianglePattern {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a;

        for(int i=1 ; i<=n ; i++)
        {
            if(i % 2 == 0) a = 0;
            else a = 1;

            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print(a);
                if(a == 1) a = 0;
                else a = 1;
            }
            System.out.println();
        }

        sc.close();
    
    }
}