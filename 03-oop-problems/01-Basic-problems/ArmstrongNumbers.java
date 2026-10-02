import java.util.Scanner;

class Armstrong{

    void findArmstrongNumbers(int num){

        for(int i=1 ; i<=num ; i++)
        {
            int temp = i;
            int rem = 0;
            int sum = 0;
            int digitCount = String.valueOf(i).length();

            while(temp !=0)
            {
               rem = temp % 10;
               sum = sum + (int)Math.pow(rem,digitCount);
               temp = temp / 10;
            }

            if(sum == i)
                System.out.print(i+" ");

        }

    }

}
public class ArmstrongNumbers {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any Number : ");
    int num = sc.nextInt();

     Armstrong a = new Armstrong();
     a.findArmstrongNumbers(num);
        
     sc.close();
    }
}