import java.util.Scanner;
public class array2 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        double[] number = new double[5];

        System.out.print("Enter 5 numbers : ");
        
        for(int i=0 ; i< number.length; i++)
        {
            number[i] = sc.nextDouble();
        }

        double sum = 0;

        for(int i=0 ; i<number.length ; i++)
        {
            sum += number[i];
        }

        double avg = sum / number.length;

        System.out.println("The sum is : "+sum);
        System.out.println("The average is : "+avg);

        sc.close();
    }
}
