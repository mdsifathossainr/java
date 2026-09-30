// Input: rows = 4, columns = 6 
// Output: 
// ****** 
// *    * 
// *    * 
// ******

import java.util.Scanner;

public class HollowRectanglePattern {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        
        for(int i=1 ; i<=rows ; i++)
        {
            for(int j = 1 ; j<=columns ; j++)
            {
                if(i == 1 || i == rows || j == 1 || j == columns)
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