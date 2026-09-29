// Input: 5
// Output:
// 1
// AB
// 123
// ABCD
// 12345

import java.util.Scanner;

public class AlphabetNumberTrianglePattern {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1 ; i<=n ; i++)
        {
            for(int j = 1 ; j<=i ; j++)
            {
                if(i % 2 == 0)
                {
                    System.out.print((char)('A' + j - 1));
                }
                else
                {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

        sc.close();
    
    }
}