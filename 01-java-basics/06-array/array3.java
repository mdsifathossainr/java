import java.util.Scanner;
public class array3 {
    public static void main(String[]args)
    {
         Scanner sc = new Scanner(System.in);

         double[] number = new double[5];

         System.out.print("Enter five numbers : ");

         for(int i=0 ; i<5 ; i++)
         {
            number[i] = sc.nextDouble();
         }

         double max = number[0];
         double min = number[0];

         for(int i=1 ; i<5 ; i++)
         {
            if(max < number[i]) max = number[i];
         }

         for(int i=1 ; i<5 ; i++)
         {
           if(min > number[i]) min = number[i];
         }

         System.out.println("The maximum number is : "+max);
         System.out.println("The minimum number is : "+min);

         sc.close();
    }
}
