// Star Diamond Pattern
// Input: 5
// Output:
//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *

import java.util.Scanner;

public class StarDiamond {
     public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 2*n -1;
        int star = 1;
        int space = n-1;

        for(int i=1 ; i<= a ; i++)
        {
           for(int j=1 ; j<= space ; j++)
           {
              System.out.print(" ");
           }
           
           for(int j = 1; j<= star ; j++)
           {
            System.out.print("*");
           }

           System.out.println();

           if(i <= a/2)
           {
              star += 2;
              space --;
           }
           else
           {
            star -= 2;
            space ++;
           }
        }
        sc.close();
    }
}

