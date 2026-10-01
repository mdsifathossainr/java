import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[]args)
    {
        System.out.print("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rem;
        int temp = n;
        int rev = 0;
        
        while(temp !=0)
        {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        System.out.println(rev);
        
        sc.close();
    }
}
