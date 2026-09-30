// Write a Java program to find the number of days in a month.

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a month number: ");
        int month = sc.nextInt();
        
        System.out.print("Input a year: ");
        int year = sc.nextInt();

        switch(month){
            case 1,3,5,7,8,10,12:
                System.out.println("31 days");
                break;
            
            case 4,6,9,11:
                System.out.println("30 days");
                break;
            
            case 2:
                if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                {
                    System.out.println("29 days");
                }
                else
                {
                    System.out.println("28 days");
                }
                break;

            default :
                 System.out.println("Invalid month");
        }

        sc.close();
    }
}