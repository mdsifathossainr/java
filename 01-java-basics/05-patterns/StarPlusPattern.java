// Input: 5
// Output:
//   *
//   *
// *****
//   *
//   *

import java.util.Scanner;

public class StarPlusPattern {
    public static void main(String[] args){
 
        System.out.println("Enter odd number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1 ; i<=n ; i++)
        {
            for(int j = 1 ; j<=n ; j++)
            {
                if(i == n/2+1 || j == n/2+1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    
    }
}