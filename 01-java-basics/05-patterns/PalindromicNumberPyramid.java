// input : 5
// output:
//    1
//   121
//  12321
// 1234321
//123454321

import java.util.Scanner;

public class PalindromicNumberPyramid{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

      
        int space = n-1;
    

        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=space ; j++)
            {
                System.out.print(" ");
            }
    
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print(j);
            }

            for(int j= i-1 ; j >=1 ; j--)
            {
                System.out.print(j);
            }
            
            space --;

            System.out.println();
        }

        sc.close();
    }
}